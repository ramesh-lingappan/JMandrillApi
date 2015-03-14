package com.jmandrillapi.api;

import org.junit.Assert;
import org.junit.Test;

public class MandrillApiTest extends MandrillBaseApiTestCase {

	@Test
	public void testApiKey() {

		String key = mandrillApi.getApiKey();

		Assert.assertNotNull(key);
		Assert.assertFalse(key.trim().isEmpty());
	}


	@Test
	public void testUsersApi(){
		Assert.assertNotNull(mandrillApi.users());
	}
}
