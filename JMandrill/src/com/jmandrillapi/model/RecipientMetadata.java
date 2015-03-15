package com.jmandrillapi.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipientMetadata {

	@JsonProperty("rcpt")
	private String recipient;

	private Map<String, String> values;

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {

		this.values = values;
	}

	public void addValue(String key, String value) {
		if (this.values == null)
			this.values = new HashMap<String, String>();
		this.values.put(key, value);
	}
}
