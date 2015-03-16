/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class RecipientMetadata.
 */
public class RecipientMetadata {

	/** The recipient. */
	@JsonProperty("rcpt")
	private String recipient;

	/** The values. */
	private Map<String, String> values;

	/**
	 * Gets the recipient.
	 *
	 * @return the recipient
	 */
	public String getRecipient() {
		return recipient;
	}

	/**
	 * Sets the recipient.
	 *
	 * @param recipient the new recipient
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/**
	 * Gets the values.
	 *
	 * @return the values
	 */
	public Map<String, String> getValues() {
		return values;
	}

	/**
	 * Sets the values.
	 *
	 * @param values the values
	 */
	public void setValues(Map<String, String> values) {

		this.values = values;
	}

	/**
	 * Adds the value.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void addValue(String key, String value) {
		if (this.values == null)
			this.values = new HashMap<String, String>();
		this.values.put(key, value);
	}
}
