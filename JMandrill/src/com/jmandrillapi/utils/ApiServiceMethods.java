package com.jmandrillapi.utils;

public class ApiServiceMethods {

	public class Users {
		public static final String BASE_USER_PATH = "/users";
		public static final String INFO = BASE_USER_PATH + "/info";
		public static final String PING = BASE_USER_PATH + "/ping";
		public static final String PING2 = BASE_USER_PATH + "/ping2";
		public static final String SENDERS = BASE_USER_PATH + "/senders";
	}

	public class Messages {
		public static final String BASE_MSG_PATH = "/messages";
		public static final String SEND = BASE_MSG_PATH + "/send";
		public static final String SEND_TEMPLATE = BASE_MSG_PATH + "/send-template";
	}

}
