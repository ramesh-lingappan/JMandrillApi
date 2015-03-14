/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.enums;

/**
 * The Enum MediaType.
 */
public enum MediaType {

	/** currently supporting only json media type as response type. */
	JSON("application/json; charset=UTF-8;");

	/** The content type. */
	private final String contentType;

	/**
	 * Instantiates a new media type.
	 *
	 * @param contentType
	 *            the content type
	 */
	private MediaType(String contentType) {
		this.contentType = contentType;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return this.name().toLowerCase().trim();
	};

	/**
	 * Gets the content type.
	 *
	 * @return the content type
	 */
	public String getContentType() {
		return this.contentType;
	}
}
