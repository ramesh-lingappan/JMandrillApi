/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.jmandrillapi.MandrillBaseApi;
import com.jmandrillapi.enums.MediaType;
import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.MandrillSubAccount;
import com.jmandrillapi.model.MandrillSubAccountInfo;
import com.jmandrillapi.utils.ApiServiceMethods;
import com.jmandrillapi.utils.ObjectUtils;

/**
 * The Class MandrillSubAccountApi.
 */
public class MandrillSubAccountApi extends MandrillBaseApi {

	/**
	 * Instantiates a new mandrill sub account api.
	 *
	 * @param apiKey
	 *            the api key
	 */
	public MandrillSubAccountApi(String apiKey) {
		super(apiKey);
	}

	/**
	 * Instantiates a new mandrill sub account api.
	 *
	 * @param apiKey
	 *            the api key
	 * @param respFormat
	 *            the resp format
	 */
	public MandrillSubAccountApi(String apiKey, MediaType respFormat) {
		super(apiKey, respFormat);
	}

	/**
	 * Get the list of subaccounts defined for the account, optionally filtered
	 * by a prefix
	 *
	 * @param prefix
	 *            an optional prefix to filter the subaccounts' ids and names
	 * @return the mandrill sub account info[]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo[] list(String prefix) throws IOException, MandrillError {

		Map<String, Object> params = null;
		if (!ObjectUtils.isBlank(prefix)) {
			params = new HashMap<String, Object>();
			params.put("q", prefix);
		}

		return request(ApiServiceMethods.SubAccounts.LIST, params, MandrillSubAccountInfo[].class);
	}

	/**
	 * Add a new subaccount
	 *
	 * @param id
	 *            a unique identifier for the subaccount to be used in sending
	 *            calls calls
	 * @param name
	 *            an optional display name to further identify the subaccount
	 * @param notes
	 *            optional extra text to associate with the subaccount
	 * @param customQuota
	 *            an optional manual hourly quota for the subaccount. If not
	 *            specified, Mandrill will manage this based on reputation
	 * @return the information saved about the new subaccount
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccount add(String id, String name, String notes, int customQuota) throws IOException, MandrillError {

		return add(new MandrillSubAccount(id, name, customQuota, notes));
	}

	/**
	 * Add a new subaccount
	 *
	 * @param subAccount
	 *            the sub account informations
	 * @return the mandrill sub account info
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo add(MandrillSubAccount subAccount) throws IOException, MandrillError {

		if (subAccount == null || ObjectUtils.isBlank(subAccount.getId()))
			throw new IllegalArgumentException("invalid mandrill subaccount properties, id must not be null");

		return request(ApiServiceMethods.SubAccounts.ADD, subAccount.toMap(), MandrillSubAccountInfo.class);
	}

	/**
	 * Given the ID of an existing subaccount, return the data about it.
	 *
	 * @param id
	 *            the unique identifier of the subaccount to query
	 * @return the mandrill sub account info
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo info(String id) throws IOException, MandrillError {

		if (ObjectUtils.isBlank(id))
			throw new IOException("id property is required");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		return request(ApiServiceMethods.SubAccounts.INFO, params, MandrillSubAccountInfo.class);
	}

	/**
	 * Update an existing subaccount
	 *
	 * @param id
	 *            the unique identifier of the subaccount to update
	 * @param name
	 *            an optional display name to further identify the subaccount
	 * @param notes
	 *            optional extra text to associate with the subaccount
	 * @param customQuota
	 *            an optional manual hourly quota for the subaccount. If not
	 *            specified, Mandrill will manage this based on reputation
	 * @return the mandrill sub account info
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo update(String id, String name, String notes, int customQuota) throws IOException, MandrillError {

		return update(new MandrillSubAccount(id, name, customQuota, notes));
	}

	/**
	 * Update.
	 *
	 * @param subAccount
	 *            the sub account information
	 * @return the mandrill sub account info
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo update(MandrillSubAccount subAccount) throws IOException, MandrillError {

		if (subAccount == null || ObjectUtils.isBlank(subAccount.getId()))
			throw new IllegalArgumentException("invalid mandrill subaccount properties, id property is required");

		return request(ApiServiceMethods.SubAccounts.UPDATE, subAccount.toMap(), MandrillSubAccountInfo.class);
	}

	/**
	 * Delete an existing subaccount. Any email related to the subaccount will
	 * be saved, but stats will be removed and any future sending calls to this
	 * subaccount will fail.
	 *
	 * @param id
	 *            the unique identifier of the subaccount to delete
	 * @return the information for the deleted subaccount
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo delete(String id) throws IOException, MandrillError {
		if (ObjectUtils.isBlank(id))
			throw new IOException("id property is required");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		return request(ApiServiceMethods.SubAccounts.DELETE, params, MandrillSubAccountInfo.class);
	}

	/**
	 * Pause a subaccount's sending. Any future emails delivered to this
	 * subaccount will be queued for a maximum of 3 days until the subaccount is
	 * resumed.
	 *
	 * @param id
	 *            the unique identifier of the subaccount to pause
	 * @return the information for the paused subaccount
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo pause(String id) throws IOException, MandrillError {
		if (ObjectUtils.isBlank(id))
			throw new IOException("id property is required");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		return request(ApiServiceMethods.SubAccounts.PAUSE, params, MandrillSubAccountInfo.class);
	}

	/**
	 * Resume a paused subaccount's sending
	 *
	 * @param id
	 *            the unique identifier of the subaccount to resume
	 * @return the information for the resumed subaccount
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws MandrillError
	 *             the mandrill error
	 */
	public MandrillSubAccountInfo resume(String id) throws IOException, MandrillError {
		if (ObjectUtils.isBlank(id))
			throw new IOException("id property is required");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		return request(ApiServiceMethods.SubAccounts.RESUME, params, MandrillSubAccountInfo.class);
	}

}
