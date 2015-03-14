/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class MandrillSender.
 */
public class MandrillSender extends MandrillStats {

	/** The address. */
	private String address;

	/** The created at. */
	@JsonProperty("created_at")
	private Date createdAt;

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the created at.
	 *
	 * @return the created at
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the created at.
	 *
	 * @param createdAt the new created at
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
