/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class RecipientMergeVars.
 */
public class RecipientMergeVars {

	/** The recipient. */
	@JsonProperty("rcpt")
	private String recipient;

	/** The vars. */
	private List<MergeVar> vars;

	/**
	 * Gets the recipient.
	 *
	 * @return the recipient
	 */
	public String getRecipient() {
		return recipient;
	}

	/**
	 * Sets the recipient.
	 *
	 * @param recipient the new recipient
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/**
	 * Gets the vars.
	 *
	 * @return the vars
	 */
	public List<MergeVar> getVars() {
		return vars;
	}

	/**
	 * Sets the vars.
	 *
	 * @param vars the new vars
	 */
	public void setVars(List<MergeVar> vars) {
		this.vars = vars;
	}

	/**
	 * Adds the vars.
	 *
	 * @param vars the vars
	 */
	public void addVars(MergeVar vars) {
		if (vars == null)
			return;
		if (this.vars == null)
			this.vars = new ArrayList<MergeVar>();
		this.vars.add(vars);
	}

	/**
	 * Adds the vars.
	 *
	 * @param name the name
	 * @param content the content
	 */
	public void addVars(String name, String content) {
		addVars(new MergeVar(name, content));
	}
}
