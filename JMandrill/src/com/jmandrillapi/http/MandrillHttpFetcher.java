/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jmandrillapi.enums.MediaType;
import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.MandrillApiError;
import com.jmandrillapi.model.MandrillObjectMapper;
import com.jmandrillapi.utils.ObjectUtils;

/**
 * The Class MandrillHttpFetcher.
 */
public class MandrillHttpFetcher {

	/** The Constant objMapper. */
	private static final MandrillObjectMapper objMapper = new MandrillObjectMapper();

	/**
	 * Make request.
	 *
	 * @param <T> the generic type
	 * @param request the request
	 * @return the t
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws MandrillError the mandrill error
	 */
	public static <T> T makeRequest(MandrillApiRequest<T> request) throws IOException, MandrillError {

		if (request == null)
			throw new IllegalArgumentException("Invalid Request Property");

		URL url = request.buildUrl();
	//	System.out.println(url.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);

		conn.setRequestProperty("Content-Type", MediaType.JSON.getContentType());
		conn.setRequestProperty("Accept", request.getRespContentType().getContentType());
		conn.setRequestMethod("POST");

		//System.out.println(new MandrillObjectMapper().writeValueAsString(request.getParams()));
		OutputStream os = conn.getOutputStream();
		os.write(jsonPayload(request.getParams()));
		os.flush();

		String respData = streamToString(conn.getInputStream());
		if (ObjectUtils.isBlank(respData))
			throw new MandrillError("Unable to parse the response body");

		if (conn.getResponseCode() != 200) {
			MandrillApiError error = objMapper.readValue(respData, MandrillApiError.class);
			throw new MandrillError("Error Status Code " + conn.getResponseCode()).apiError(error);
		} else {
			return objMapper.readValue(respData, request.getRespType());
		}
	}

	/**
	 * Stream to string.
	 *
	 * @param is the is
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static String streamToString(InputStream is) throws IOException {
		try (BufferedReader rd = new BufferedReader(new InputStreamReader(is))) {
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
		}
	}

	/**
	 * Json payload.
	 *
	 * @param obj the obj
	 * @return the byte[]
	 * @throws JsonProcessingException the json processing exception
	 */
	public static byte[] jsonPayload(Object obj) throws JsonProcessingException {
		if (obj == null)
			return null;
		return objMapper.writeValueAsBytes(obj);
	}
}
