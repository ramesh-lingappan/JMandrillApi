/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.utils;

import java.util.Collection;
import java.util.Map;

/**
 * The Class ObjectUtils.
 */
public class ObjectUtils {

	/**
	 * Checks if is null or empty.
	 *
	 * @param value the value
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(String value) {
		return (value == null || value.length() <= 0);
	}

	/**
	 * Checks if is blank.
	 *
	 * @param value the value
	 * @return true, if is blank
	 */
	public static boolean isBlank(String value) {
		return (value == null || value.trim().length() <= 0);
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param obj the obj
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Collection<?> obj) {
		return (obj == null || obj.isEmpty());
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param map the map
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Map<?, ?> map) {
		return (map == null || map.isEmpty());
	}

	/**
	 * Null to empty.
	 *
	 * @param value the value
	 * @return the string
	 */
	public static String nullToEmpty(String value) {
		return value == null ? "" : value;
	}
}
