/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

/**
 * The Class MessageStatus.
 */
public class MessageStatus {

	/** The _id. */
	private String email, status, reject_reason, _id;

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
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the reject reason.
	 *
	 * @return the reject reason
	 */
	public String getRejectReason() {
		return reject_reason;
	}

	/**
	 * Sets the reject reason.
	 *
	 * @param rejectReason the new reject reason
	 */
	public void setRejectReason(String rejectReason) {
		this.reject_reason = rejectReason;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return _id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this._id = id;
	}

}
