package com.jmandrillapi.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipientMergeVars {

	@JsonProperty("rcpt")
	private String recipient;

	private List<MergeVar> vars;

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public List<MergeVar> getVars() {
		return vars;
	}

	public void setVars(List<MergeVar> vars) {
		this.vars = vars;
	}

	public void addVars(MergeVar vars) {
		if (vars == null)
			return;
		if (this.vars == null)
			this.vars = new ArrayList<MergeVar>();
		this.vars.add(vars);
	}

	public void addVars(String name, String content) {
		addVars(new MergeVar(name, content));
	}
}
