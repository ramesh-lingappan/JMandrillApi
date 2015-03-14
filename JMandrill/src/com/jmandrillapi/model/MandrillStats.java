/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class MandrillStats.
 */
public class MandrillStats {

	/** The rejects. */
	private int sent, rejects;
	
	/** The unsubs. */
	private int complaints, unsubs;
	
	/** The clicks. */
	private int opens, clicks;

	/** The hard bounces. */
	@JsonProperty("hard_bounces")
	private int hardBounces;

	/** The soft bounces. */
	@JsonProperty("soft_bounces")
	private int softBounces;

	/** The unique opens. */
	@JsonProperty("unique_opens")
	private int uniqueOpens;

	/** The unique clicks. */
	@JsonProperty("unique_clicks")
	private int uniqueClicks;

	/**
	 * Gets the sent.
	 *
	 * @return the sent
	 */
	public int getSent() {
		return sent;
	}

	/**
	 * Sets the sent.
	 *
	 * @param sent the new sent
	 */
	public void setSent(int sent) {
		this.sent = sent;
	}

	/**
	 * Gets the rejects.
	 *
	 * @return the rejects
	 */
	public int getRejects() {
		return rejects;
	}

	/**
	 * Sets the rejects.
	 *
	 * @param rejects the new rejects
	 */
	public void setRejects(int rejects) {
		this.rejects = rejects;
	}

	/**
	 * Gets the complaints.
	 *
	 * @return the complaints
	 */
	public int getComplaints() {
		return complaints;
	}

	/**
	 * Sets the complaints.
	 *
	 * @param complaints the new complaints
	 */
	public void setComplaints(int complaints) {
		this.complaints = complaints;
	}

	/**
	 * Gets the unsubs.
	 *
	 * @return the unsubs
	 */
	public int getUnsubs() {
		return unsubs;
	}

	/**
	 * Sets the unsubs.
	 *
	 * @param unsubs the new unsubs
	 */
	public void setUnsubs(int unsubs) {
		this.unsubs = unsubs;
	}

	/**
	 * Gets the opens.
	 *
	 * @return the opens
	 */
	public int getOpens() {
		return opens;
	}

	/**
	 * Sets the opens.
	 *
	 * @param opens the new opens
	 */
	public void setOpens(int opens) {
		this.opens = opens;
	}

	/**
	 * Gets the clicks.
	 *
	 * @return the clicks
	 */
	public int getClicks() {
		return clicks;
	}

	/**
	 * Sets the clicks.
	 *
	 * @param clicks the new clicks
	 */
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	/**
	 * Gets the hard bounces.
	 *
	 * @return the hard bounces
	 */
	public int getHardBounces() {
		return hardBounces;
	}

	/**
	 * Sets the hard bounces.
	 *
	 * @param hardBounces the new hard bounces
	 */
	public void setHardBounces(int hardBounces) {
		this.hardBounces = hardBounces;
	}

	/**
	 * Gets the soft bounces.
	 *
	 * @return the soft bounces
	 */
	public int getSoftBounces() {
		return softBounces;
	}

	/**
	 * Sets the soft bounces.
	 *
	 * @param softBounces the new soft bounces
	 */
	public void setSoftBounces(int softBounces) {
		this.softBounces = softBounces;
	}

	/**
	 * Gets the unique opens.
	 *
	 * @return the unique opens
	 */
	public int getUniqueOpens() {
		return uniqueOpens;
	}

	/**
	 * Sets the unique opens.
	 *
	 * @param uniqueOpens the new unique opens
	 */
	public void setUniqueOpens(int uniqueOpens) {
		this.uniqueOpens = uniqueOpens;
	}

	/**
	 * Gets the unique clicks.
	 *
	 * @return the unique clicks
	 */
	public int getUniqueClicks() {
		return uniqueClicks;
	}

	/**
	 * Sets the unique clicks.
	 *
	 * @param uniqueClicks the new unique clicks
	 */
	public void setUniqueClicks(int uniqueClicks) {
		this.uniqueClicks = uniqueClicks;
	}

}
