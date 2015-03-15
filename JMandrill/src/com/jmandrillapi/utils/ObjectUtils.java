/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class ObjectUtils.
 */
public class ObjectUtils {

	/**
	 * Checks if is null or empty.
	 *
	 * @param value
	 *            the value
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(String value) {
		return (value == null || value.length() <= 0);
	}

	/**
	 * Checks if is blank.
	 *
	 * @param value
	 *            the value
	 * @return true, if is blank
	 */
	public static boolean isBlank(String value) {
		return (value == null || value.trim().length() <= 0);
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param obj
	 *            the obj
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Collection<?> obj) {
		return (obj == null || obj.isEmpty());
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param map
	 *            the map
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Map<?, ?> map) {
		return (map == null || map.isEmpty());
	}

	/**
	 * Null to empty.
	 *
	 * @param value
	 *            the value
	 * @return the string
	 */
	public static String nullToEmpty(String value) {
		return value == null ? "" : value;
	}

	/**
	 * Check and adds elements to list (create new ArrayList if list is null)
	 *
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @param value
	 *            the value
	 * @return the list (if list is null, create new array list)
	 */
	public static <T> List<T> addToList(List<T> list, T value) {
		if (value == null)
			return list;
		if (list == null)
			list = new ArrayList<T>();
		list.add(value);
		return list;
	}

	public static <K, V> Map<K, V> addToMap(Map<K, V> map, K key, V value) {
		if (key == null)
			return map;
		if (map == null)
			map = new HashMap<K, V>();
		map.put(key, value);
		return map;
	}
}
