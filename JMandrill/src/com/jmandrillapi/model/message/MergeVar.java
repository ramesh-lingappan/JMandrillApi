/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

/**
 * The Class MergeVar.
 */
public class MergeVar {

	/** The content. */
	private String name, content;

	/**
	 * Instantiates a new merge var.
	 */
	public MergeVar() {
	}

	/**
	 * Instantiates a new merge var.
	 *
	 * @param name the name
	 * @param content the content
	 */
	public MergeVar(String name, String content) {
		this.name = name;
		this.content = content;
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
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
