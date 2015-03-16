/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.enums;

/**
 * The Enum RecipientType.
 */
public enum RecipientType {

	/** The to. */
	TO,
	/** The cc. */
	CC,
	/** The bcc. */
	BCC;

	/**
	 * Gets the type.
	 *
	 * @param type
	 *            the type
	 * @return the type
	 */
	public static RecipientType getType(String type) {
		try {
			return Enum.valueOf(RecipientType.class, type.toUpperCase().trim());
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
