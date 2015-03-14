package com.jmandrillapi.api;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.MandrillSender;
import com.jmandrillapi.model.MandrillUserInfo;

public class MandrillUserApiTest extends MandrillBaseApiTestCase {

	@Test
	public void testInfoApi() throws IOException, MandrillError {
		MandrillUserInfo user = mandrillApi.users().info();
		Assert.assertNotNull(user);
		Assert.assertNotNull(user.getUserName());
		Assert.assertNotNull(user.getStats());

	}

	@Test
	public void testUserPing2Api() throws IOException, MandrillError {
		Map<String, Object> resp = mandrillApi.users().ping2();

		Assert.assertNotNull(resp);
		Assert.assertEquals("PONG!", resp.get("PING"));

	}

	@Test
	public void testUserPingApi() throws IOException, MandrillError {
		String pong = mandrillApi.users().ping();
		Assert.assertEquals("PONG!", pong);
	}

	@Test
	public void testUserSenders() throws IOException, MandrillError {
		List<MandrillSender> senders = mandrillApi.users().senders();
		Assert.assertNotNull(senders);
	}

}
