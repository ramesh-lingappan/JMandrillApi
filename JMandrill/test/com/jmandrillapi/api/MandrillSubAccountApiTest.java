package com.jmandrillapi.api;

import java.io.IOException;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.MandrillSubAccountInfo;

public class MandrillSubAccountApiTest extends MandrillBaseApiTestCase {

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAdd() throws IOException, MandrillError {
		mandrillApi.subaccounts().add(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidUpdate() throws IOException, MandrillError {
		mandrillApi.subaccounts().update(null);
	}

	@Test(expected = IOException.class)
	public void testInvalidInfo() throws IOException, MandrillError {
		mandrillApi.subaccounts().info(null);
	}

	@Test(expected = IOException.class)
	public void testInvalidDelete() throws IOException, MandrillError {
		mandrillApi.subaccounts().delete(null);
	}

	@Test(expected = IOException.class)
	public void testInvalidPause() throws IOException, MandrillError {
		mandrillApi.subaccounts().pause(null);
	}

	@Test(expected = IOException.class)
	public void testInvalidResume() throws IOException, MandrillError {
		mandrillApi.subaccounts().resume(null);
	}

	@Test
	public void testFetchList() throws IOException, MandrillError {
		MandrillSubAccountInfo[] result = mandrillApi.subaccounts().list(null);
		Assert.assertNotNull(result);
	}

	@Test(expected = MandrillError.class)
	public void testGetInvalidSubAcctInfo() throws IOException, MandrillError {
		MandrillSubAccountInfo result = mandrillApi.subaccounts().info(UUID.randomUUID().toString());
		Assert.assertNull(result);
	}

	@Test(expected = MandrillError.class)
	public void testDeleteInvalidSubAcctInfo() throws IOException, MandrillError {
		MandrillSubAccountInfo result = mandrillApi.subaccounts().delete(UUID.randomUUID().toString());
		Assert.assertNull(result);
	}
}
