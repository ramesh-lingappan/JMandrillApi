package com.jmandrillapi.model;

import java.util.HashMap;
import java.util.Map;

public class MandrillSubAccount {

	private String id, name, status, notes;

	private int custom_quota;

	public MandrillSubAccount(String id, String name, int customQuota, String notes) {
		this.id = id;
		this.name = name;
		this.notes = notes;
		this.custom_quota = customQuota;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getCustomQuota() {
		return custom_quota;
	}

	public void setCustomQuota(int customQuota) {
		this.custom_quota = customQuota;
	}

	public Map<String, Object> toMap() {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("id", id);
		map.put("name", name);
		map.put("status", status);
		map.put("notes", notes);
		if (custom_quota > 0)
			map.put("custom_quota", custom_quota);

		return map;
	};
}
