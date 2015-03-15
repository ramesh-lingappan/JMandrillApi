package com.jmandrillapi.enums;

public enum RecipientType {
	TO, CC, BCC;

	public static RecipientType getType(String type) {
		try {
			return Enum.valueOf(RecipientType.class, type.toUpperCase().trim());
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
