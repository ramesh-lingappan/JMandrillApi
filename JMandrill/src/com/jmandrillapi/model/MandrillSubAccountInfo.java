package com.jmandrillapi.model;

import java.util.Date;

public class MandrillSubAccountInfo extends MandrillSubAccount {

	private int reputation;

	private Date created_at, first_sent_at;

	private int sent_hourly, sent_weekly, sent_monthly, sent_total, hourly_quota;

	private MandrillStats last_30_days;

	public MandrillSubAccountInfo(String id, String name, int customQuota, String notes) {
		super(id, name, customQuota, notes);
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public Date getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(Date createdAt) {
		this.created_at = createdAt;
	}

	public Date getFirstSentAt() {
		return first_sent_at;
	}

	public void setFirstSentAt(Date firstSentAt) {
		this.first_sent_at = firstSentAt;
	}

	public int getSentHourly() {
		return sent_hourly;
	}

	public void setSentHourly(int sentHourly) {
		this.sent_hourly = sentHourly;
	}

	public int getSentWeekly() {
		return sent_weekly;
	}

	public void setSentWeekly(int sentWeekly) {
		this.sent_weekly = sentWeekly;
	}

	public int getSentMonthly() {
		return sent_monthly;
	}

	public void setSent_monthly(int sentMonthly) {
		this.sent_monthly = sentMonthly;
	}

	public int getSentTotal() {
		return sent_total;
	}

	public void setSentTotal(int sentTotal) {
		this.sent_total = sentTotal;
	}

	public int getHourlyQuota() {
		return hourly_quota;
	}

	public void setHourlyQuota(int hourlyQuota) {
		this.hourly_quota = hourlyQuota;
	}

	public MandrillStats getLast30Days() {
		return last_30_days;
	}

	public void setLast30Days(MandrillStats last30Days) {
		this.last_30_days = last30Days;
	}

}
