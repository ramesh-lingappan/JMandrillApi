/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.services;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.jmandrillapi.MandrillBaseApi;
import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.MandrillSender;
import com.jmandrillapi.model.MandrillUserInfo;
import com.jmandrillapi.utils.ApiServiceMethods;

/**
 * The Class MandrillUserApiService.
 */
public class MandrillUserApiService extends MandrillBaseApi {

	/** The Constant USER_PATH. */
	public static final String USER_PATH = "/users";

	/**
	 * Instantiates a new mandrill user api service.
	 *
	 * @param apiKey
	 *            the api key
	 */
	public MandrillUserApiService(String apiKey) {
		super(apiKey);
	}

	/**
	 * fetchs User Info of connected api key
	 *
	 * @return the mandrill user info
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillUserInfo info() throws IOException, MandrillError {
		return request(ApiServiceMethods.Users.INFO, null, MandrillUserInfo.class);
	}

	/**
	 * Ping.
	 *
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public String ping() throws IOException, MandrillError {
		return request(ApiServiceMethods.Users.PING, null, String.class);
	}

	/**
	 * Ping2.
	 *
	 * @return the map
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> ping2() throws IOException, MandrillError {
		return request(ApiServiceMethods.Users.PING2, null, Map.class);
	}

	/**
	 * Fetches list of Senders.
	 *
	 * @return the list
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public List<MandrillSender> senders() throws IOException, MandrillError {
		return Arrays.asList(request(ApiServiceMethods.Users.SENDERS, null, MandrillSender[].class));
	}
}
