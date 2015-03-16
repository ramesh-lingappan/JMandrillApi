/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.services;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.jmandrillapi.MandrillBaseApi;
import com.jmandrillapi.enums.MediaType;
import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.message.MandrillMessage;
import com.jmandrillapi.model.message.MandrillMessageParam;
import com.jmandrillapi.model.message.MandrillMessageTemplateParam;
import com.jmandrillapi.model.message.MessageStatus;
import com.jmandrillapi.model.message.TemplateContent;
import com.jmandrillapi.utils.ApiServiceMethods;

/**
 * The Class MandrillMessageApi.
 */
public class MandrillMessageApi extends MandrillBaseApi {

	/**
	 * Instantiates a new mandrill message api.
	 *
	 * @param apiKey
	 *            the api key
	 */
	public MandrillMessageApi(String apiKey) {
		super(apiKey);
	}

	/**
	 * Instantiates a new mandrill message api.
	 *
	 * @param apiKey
	 *            the api key
	 * @param respFormat
	 *            the resp format
	 */
	public MandrillMessageApi(String apiKey, MediaType respFormat) {
		super(apiKey, respFormat);
	}

	/**
	 * Send a message.
	 *
	 * @param msg
	 *            the information on the message to send
	 * @param async
	 *            the async - true value enable a background sending mode, in
	 *            async mode, messages/send will immediately return a status of
	 *            "queued" for every recipient.
	 * @param ipPool
	 *            the ip pool
	 * @return the message status[]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MessageStatus[] send(MandrillMessage msg, boolean async, String ipPool) throws IOException, MandrillError {
		return this.send(new MandrillMessageParam(msg, async, ipPool));
	}

	/**
	 * Send a message.
	 *
	 * @param msg
	 *            the msg
	 * @param async
	 *            the async - true value enable a background sending mode, in
	 *            async mode, messages/send will immediately return a status of
	 *            "queued" for every recipient.
	 * @param ipPool
	 *            the ip pool
	 * @param sendAt
	 *            sets when this message should be sent, If you specify a time
	 *            in the past, the message will be sent immediately
	 * @return the message status[]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MessageStatus[] send(final MandrillMessage msg, boolean async, String ipPool, Date sendAt) throws IOException, MandrillError {

		return this.send(new MandrillMessageParam(msg, async, ipPool, sendAt));
	}

	/**
	 * Send.
	 *
	 * @param msgParam
	 *            msg param includes message to send, and other optional
	 *            settings
	 * @return the message status[]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MessageStatus[] send(MandrillMessageParam msgParam) throws IOException, MandrillError {

		if (msgParam == null)
			throw new IOException("message param object cannot be null");
		return request(ApiServiceMethods.Messages.SEND, msgParam.toMap(), MessageStatus[].class);
	}

	/**
	 * Send template.
	 *
	 * @param templateName
	 *            the template name
	 * @param templateContent
	 *            the template content
	 * @param msg
	 *            the msg
	 * @param async
	 *            the async
	 * @return the message status[]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MessageStatus[] sendTemplate(String templateName, List<TemplateContent> templateContent, MandrillMessage msg, boolean async)
			throws IOException, MandrillError {

		return this.sendTemplate(new MandrillMessageTemplateParam(templateName, templateContent, msg, async));
	}

	/**
	 * Send template.
	 *
	 * @param msgTemplateParam
	 *            the msg template param
	 * @return the message status[]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MessageStatus[] sendTemplate(MandrillMessageTemplateParam msgTemplateParam) throws IOException, MandrillError {

		if (msgTemplateParam == null)
			throw new IOException("message template or message object cannot be null");

		return request(ApiServiceMethods.Messages.SEND_TEMPLATE, msgTemplateParam.toMap(), MessageStatus[].class);
	}

}
