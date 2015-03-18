/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi;

import com.jmandrillapi.enums.MediaType;
import com.jmandrillapi.services.MandrillMessageApi;
import com.jmandrillapi.services.MandrillSubAccountApi;
import com.jmandrillapi.services.MandrillUserApi;

/**
 * The Class MandrillApi.
 */
public class MandrillApi extends MandrillBaseApi {

	/**
	 * Instantiates a new mandrill api.
	 *
	 * @param apiKey
	 *            the api key
	 */
	public MandrillApi(String apiKey) {
		super(apiKey);
	}

	/**
	 * Instantiates a new mandrill api.
	 *
	 * @param apiKey
	 *            the api key
	 * @param respFormat
	 *            the resp format
	 */
	public MandrillApi(String apiKey, MediaType respFormat) {
		super(apiKey, respFormat);
	}

	/**
	 * Users.
	 *
	 * @return the mandrill user api service
	 */
	public MandrillUserApi users() {
		return new MandrillUserApi(apiKey);
	}

	/**
	 * Messages Api
	 *
	 * @return the mandrill message api
	 */
	public MandrillMessageApi messages() {
		return new MandrillMessageApi(apiKey);
	}

	/**
	 * Subaccounts Api
	 *
	 * With subaccounts api service - you can separate reputation, activity,
	 * reports, and quotas for different types of senders in a single Mandrill
	 * account.
	 *
	 * @return the mandrill sub account api
	 */
	public MandrillSubAccountApi subaccounts() {
		return new MandrillSubAccountApi(apiKey);
	}

}
