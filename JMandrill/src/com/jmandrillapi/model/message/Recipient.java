/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmandrillapi.enums.RecipientType;

/**
 * The Class Recipient.
 */
public class Recipient {

	/** The name. */
	private String email, name;
	
	/** The type. */
	private RecipientType type = RecipientType.TO;

	/**
	 * Instantiates a new recipient.
	 *
	 * @param email the email
	 * @param name the name
	 */
	public Recipient(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}

	/**
	 * Instantiates a new recipient.
	 *
	 * @param email the email
	 * @param name the name
	 * @param type the type
	 */
	public Recipient(String email, String name, RecipientType type) {
		super();
		this.email = email;
		this.name = name;
		this.type = type;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	@JsonIgnore
	public RecipientType getType() {
		return type;
	}

	/**
	 * Gets the type string.
	 *
	 * @return the type string
	 */
	@JsonProperty("type")
	public String getTypeString() {
		return type == null ? null : type.toString();
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(RecipientType type) {
		this.type = type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = RecipientType.getType(type);
	}
}
