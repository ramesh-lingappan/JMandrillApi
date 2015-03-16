/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

import java.util.List;
import java.util.Map;

import com.jmandrillapi.utils.ObjectUtils;

/**
 * The Class MandrillMessageTemplateParam.
 */
public class MandrillMessageTemplateParam extends MandrillMessageParam {

	/** The template_name. */
	private String template_name;
	
	/** The template_content. */
	private List<TemplateContent> template_content;

	/**
	 * Instantiates a new mandrill message template param.
	 */
	public MandrillMessageTemplateParam() {
		super();
	}

	/**
	 * Instantiates a new mandrill message template param.
	 *
	 * @param message the message
	 * @param async the async
	 */
	public MandrillMessageTemplateParam(MandrillMessage message, boolean async) {
		super(message, async);
	}

	/**
	 * Instantiates a new mandrill message template param.
	 *
	 * @param templateName the template name
	 * @param templateContent the template content
	 * @param message the message
	 * @param async the async
	 */
	public MandrillMessageTemplateParam(String templateName, List<TemplateContent> templateContent, MandrillMessage message, boolean async) {
		super(message, async);
		this.template_name = templateName;
		this.template_content = templateContent;
	}

	/**
	 * Gets the template name.
	 *
	 * @return the template name
	 */
	public String getTemplateName() {
		return template_name;
	}

	/**
	 * Sets the template name.
	 *
	 * @param template_name the new template name
	 */
	public void setTemplateName(String template_name) {
		this.template_name = template_name;
	}

	/**
	 * Gets the template content.
	 *
	 * @return the template content
	 */
	public List<TemplateContent> getTemplateContent() {
		return template_content;
	}

	/**
	 * Sets the template content.
	 *
	 * @param templateContent the new template content
	 */
	public void setTemplateContent(List<TemplateContent> templateContent) {
		this.template_content = templateContent;
	}

	/**
	 * Adds the template content.
	 *
	 * @param content the content
	 */
	public void addTemplateContent(TemplateContent content) {
		this.template_content = ObjectUtils.addToList(template_content, content);
	}

	/* (non-Javadoc)
	 * @see com.jmandrillapi.model.message.MandrillMessageParam#toMap()
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		map.put("template_name", template_name);
		map.put("template_content", template_content);

		return map;
	}
}
