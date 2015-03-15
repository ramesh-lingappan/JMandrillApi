package com.jmandrillapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmandrillapi.enums.RecipientType;

public class Recipient {

	private String email, name;
	private RecipientType type = RecipientType.TO;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RecipientType getType() {
		return type;
	}

	public void setType(RecipientType type) {
		this.type = type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = RecipientType.getType(type);
	}
}
