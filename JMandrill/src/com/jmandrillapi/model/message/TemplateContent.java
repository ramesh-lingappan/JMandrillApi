/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

/**
 * The Class TemplateContent.
 */
public class TemplateContent {

	/** The content. */
	private String name, content;

	/**
	 * Instantiates a new template content.
	 *
	 * @param name the name
	 * @param content the content
	 */
	public TemplateContent(String name, String content) {
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
