/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The Class MandrillMessageParam.
 */
public class MandrillMessageParam {

	/** The message. */
	private MandrillMessage message;

	/** The async. */
	private boolean async;

	/** The ip pool. */
	private String ipPool;

	/** The send at. */
	private Date sendAt;

	/**
	 * Instantiates a new mandrill message param.
	 */
	public MandrillMessageParam() {

	}

	/**
	 * Instantiates a new mandrill message param.
	 *
	 * @param message the message
	 * @param async the async
	 */
	public MandrillMessageParam(MandrillMessage message, boolean async) {
		this(message, async, null, null);
	}

	/**
	 * Instantiates a new mandrill message param.
	 *
	 * @param message the message
	 * @param async the async
	 * @param ipPool the ip pool
	 */
	public MandrillMessageParam(MandrillMessage message, boolean async, String ipPool) {
		this(message, async, ipPool, null);
	}

	/**
	 * Instantiates a new mandrill message param.
	 *
	 * @param message the message
	 * @param async the async
	 * @param ipPool the ip pool
	 * @param sendAt the send at
	 */
	public MandrillMessageParam(MandrillMessage message, boolean async, String ipPool, Date sendAt) {
		this.message = message;
		this.async = async;
		this.ipPool = ipPool;
		this.sendAt = sendAt;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public MandrillMessage getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(MandrillMessage message) {
		this.message = message;
	}

	/**
	 * Checks if is async.
	 *
	 * @return true, if is async
	 */
	public boolean isAsync() {
		return async;
	}

	/**
	 * Sets the async.
	 *
	 * @param async the new async
	 */
	public void setAsync(boolean async) {
		this.async = async;
	}

	/**
	 * Gets the ip pool.
	 *
	 * @return the ip pool
	 */
	public String getIpPool() {
		return ipPool;
	}

	/**
	 * Sets the ip pool.
	 *
	 * @param ipPool the new ip pool
	 */
	public void setIpPool(String ipPool) {
		this.ipPool = ipPool;
	}

	/**
	 * Gets the send at.
	 *
	 * @return the send at
	 */
	public Date getSendAt() {
		return sendAt;
	}

	/**
	 * Sets the send at.
	 *
	 * @param sendAt the new send at
	 */
	public void setSendAt(Date sendAt) {
		this.sendAt = sendAt;
	}

	/**
	 * To map.
	 *
	 * @return the map
	 */
	@JsonIgnore
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("async", async);
		map.put("message", message);
		map.put("ip_pool", ipPool);
		map.put("send_at", sendAt);

		return map;
	}

}
