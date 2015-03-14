
package com.jmandrillapi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.jmandrillapi.enums.MediaType;
import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.http.MandrillApiRequest;
import com.jmandrillapi.http.MandrillHttpFetcher;
import com.jmandrillapi.utils.MandrillConstants;
import com.jmandrillapi.utils.ObjectUtils;

/**
 * The Class MandrillBaseApi.
 */
public abstract class MandrillBaseApi {

	/** The api key. */
	protected final String apiKey;

	/** The resp format. */
	protected final MediaType respFormat;

	/**
	 * Instantiates a new mandrill base api.
	 *
	 * @param apiKey the api key
	 */
	public MandrillBaseApi(String apiKey) {
		this(apiKey, null);
	}

	/**
	 * Instantiates a new mandrill base api.
	 *
	 * @param apiKey the api key
	 * @param respFormat the resp format
	 */
	public MandrillBaseApi(String apiKey, MediaType respFormat) {
		if (ObjectUtils.isBlank(apiKey))
			throw new IllegalArgumentException("invalid api key");

		this.apiKey = apiKey;
		this.respFormat = respFormat == null ? MediaType.JSON : respFormat;
	}

	/**
	 * Gets the api key.
	 *
	 * @return the api key
	 */
	public String getApiKey(){
		return this.apiKey;
	}

	/**
	 * Gets the resp fromat.
	 *
	 * @return the resp fromat
	 */
	public MediaType getRespFromat(){
		return this.respFormat;
	}

	/**
	 * Default params.
	 *
	 * @return the map
	 */
	public Map<String, Object> defaultParams() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("key", apiKey);
		return params;
	}

	/**
	 * Final params.
	 *
	 * @param params the params
	 * @return the map
	 */
	public Map<String, Object> finalParams(Map<String, Object> params) {
		Map<String, Object> data = defaultParams();
		if (!ObjectUtils.isNullOrEmpty(params))
			data.putAll(params);
		return data;
	}

	/**
	 * Request.
	 *
	 * @param <T> the generic type
	 * @param path the path
	 * @param params the params
	 * @param responseType the response type
	 * @return the t
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws MandrillError the mandrill error
	 */
	public final <T> T request(final String path, final Map<String, Object> params, Class<T> responseType) throws IOException, MandrillError {

		String url = MandrillConstants.API_BASE_URL + path;
		MandrillApiRequest<T> request = new MandrillApiRequest<T>(url, responseType).params(finalParams(params)).respContentType(respFormat);
		return MandrillHttpFetcher.makeRequest(request);
	}
}
