/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.error;

import com.jmandrillapi.model.MandrillApiError;

/**
 * The Class MandrillError.
 */
public class MandrillError extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The api error. */
	private MandrillApiError apiError;

	/**
	 * Instantiates a new mandrill error.
	 */
	public MandrillError() {
		super();
	}

	/**
	 * Instantiates a new mandrill error.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public MandrillError(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new mandrill error.
	 *
	 * @param message the message
	 */
	public MandrillError(String message) {
		super(message);
	}

	/**
	 * Instantiates a new mandrill error.
	 *
	 * @param cause the cause
	 */
	public MandrillError(Throwable cause) {
		super(cause);
	}

	/**
	 * Api error.
	 *
	 * @param apiError the api error
	 * @return the mandrill error
	 */
	public MandrillError apiError(MandrillApiError apiError) {
		this.apiError = apiError;
		return this;
	}

	/**
	 * Gets the api error.
	 *
	 * @return the api error
	 */
	public MandrillApiError getApiError() {
		return apiError;
	}

	/**
	 * Checks for api error.
	 *
	 * @return true, if successful
	 */
	public boolean hasApiError() {
		return apiError != null;
	}
}
