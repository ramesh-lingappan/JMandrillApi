/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class MandrillUserInfo.
 */
public class MandrillUserInfo {


	/** The user name. */
	@JsonProperty("username")
	private String userName;

	/** The public id. */
	@JsonProperty("public_id")
	private String publicId;

	/** The reputation. */
	private int reputation;

	/** The hourly quota. */
	@JsonProperty("hourly_quota")
	private int hourlyQuota;

	/** The backlog. */
	private int backlog;

	/** The created at. */
	@JsonProperty("created_at")
	private Date createdAt;

	/** The stats. */
	private Map<String, MandrillStats> stats;

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the public id.
	 *
	 * @return the public id
	 */
	public String getPublicId() {
		return publicId;
	}

	/**
	 * Sets the public id.
	 *
	 * @param publicId the new public id
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	/**
	 * Gets the reputation.
	 *
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}

	/**
	 * Sets the reputation.
	 *
	 * @param reputation the new reputation
	 */
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	/**
	 * Gets the hourly quota.
	 *
	 * @return the hourly quota
	 */
	public int getHourlyQuota() {
		return hourlyQuota;
	}

	/**
	 * Sets the hourly quota.
	 *
	 * @param hourlyQuota the new hourly quota
	 */
	public void setHourlyQuota(int hourlyQuota) {
		this.hourlyQuota = hourlyQuota;
	}

	/**
	 * Gets the backlog.
	 *
	 * @return the backlog
	 */
	public int getBacklog() {
		return backlog;
	}

	/**
	 * Sets the backlog.
	 *
	 * @param backlog the new backlog
	 */
	public void setBacklog(int backlog) {
		this.backlog = backlog;
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

	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public Map<String, MandrillStats> getStats() {
		return stats;
	}

	/**
	 * Sets the stats.
	 *
	 * @param stats the stats
	 */
	public void setStats(Map<String, MandrillStats> stats) {
		this.stats = stats;
	}

	/**
	 * Gets the today stats.
	 *
	 * @return the today stats
	 */
	public MandrillStats getTodayStats() {
		return stats.get("today");
	}

	/**
	 * Gets the last7 day stats.
	 *
	 * @return the last7 day stats
	 */
	public MandrillStats getLast7DayStats() {
		return stats.get("last_7_days");
	}

	/**
	 * Gets the last30 day stats.
	 *
	 * @return the last30 day stats
	 */
	public MandrillStats getLast30DayStats() {
		return stats.get("last_30_days");
	}

	/**
	 * Gets the last60 day stats.
	 *
	 * @return the last60 day stats
	 */
	public MandrillStats getLast60DayStats() {
		return stats.get("last_60_days");
	}

	/**
	 * Gets the last90 day stats.
	 *
	 * @return the last90 day stats
	 */
	public MandrillStats getLast90DayStats() {
		return stats.get("last_90_days");
	}

	/**
	 * Gets the all time stats.
	 *
	 * @return the all time stats
	 */
	public MandrillStats getAllTimeStats() {
		return stats.get("all_time");
	}

}
