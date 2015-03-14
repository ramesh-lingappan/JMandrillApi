/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import com.jmandrillapi.enums.MediaType;
import com.jmandrillapi.utils.ObjectUtils;

/**
 * The Class MandrillApiRequest.
 *
 * @param <T> the generic type
 */
public class MandrillApiRequest<T> {

	/** The url. */
	private String url;
	
	/** The params. */
	private Map<String, Object> params;

	/** The resp content type. */
	private MediaType respContentType = MediaType.JSON;
	
	/** The response type. */
	private Class<T> responseType;

	/**
	 * Instantiates a new mandrill api request.
	 *
	 * @param url the url
	 */
	public MandrillApiRequest(String url) {
		this.url(url);
	}

	/**
	 * Instantiates a new mandrill api request.
	 *
	 * @param url the url
	 * @param responseType the response type
	 */
	public MandrillApiRequest(String url, Class<T> responseType) {
		this.url(url);
		this.type(responseType);
	}

	/* Builder Methods */

	/**
	 * Url.
	 *
	 * @param url the url
	 * @return the mandrill api request
	 */
	public MandrillApiRequest<T> url(String url) {
		if (ObjectUtils.isBlank(url))
			throw new IllegalArgumentException("invalid url value");
		this.url = url;
		return this;
	}

	/**
	 * Params.
	 *
	 * @param params the params
	 * @return the mandrill api request
	 */
	public MandrillApiRequest<T> params(Map<String, Object> params) {
		this.params = params;
		return this;
	}

	/**
	 * Type.
	 *
	 * @param responseType the response type
	 * @return the mandrill api request
	 */
	public MandrillApiRequest<T> type(Class<T> responseType) {
		this.responseType = responseType;
		if (responseType == null)
			throw new IllegalArgumentException("invalid response type");
		return this;
	}

	/**
	 * Resp content type.
	 *
	 * @param type the type
	 * @return the mandrill api request
	 */
	public MandrillApiRequest<T> respContentType(MediaType type) {
		if (type != null)
			this.respContentType = type;
		return this;
	}

	/**
	 * Gets the params.
	 *
	 * @return the params
	 */
	public Map<String, Object> getParams() {
		return this.params;
	}

	/**
	 * Gets the resp type.
	 *
	 * @return the resp type
	 */
	public Class<T> getRespType() {
		return this.responseType;
	}

	/**
	 * Gets the resp content type.
	 *
	 * @return the resp content type
	 */
	public MediaType getRespContentType() {
		return this.respContentType;
	}

	/**
	 * Builds the url.
	 *
	 * @return the url
	 * @throws MalformedURLException the malformed url exception
	 */
	public URL buildUrl() throws MalformedURLException {
		return new URL(url + "." + respContentType.toString());
	}
}
