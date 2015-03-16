package com.jmandrillapi.api;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.jmandrillapi.error.MandrillError;
import com.jmandrillapi.model.message.MandrillMessageParam;
import com.jmandrillapi.model.message.MessageStatus;

public class MandrillMessageApiTest extends MandrillApiTest {

	@Test(expected = IOException.class)
	public final void testSendInvalidMessageParam() throws IOException, MandrillError {

		mandrillApi.messages().send(null);
	}

	@Test
	public final void testSendNullMessage() throws IOException, MandrillError {
		MessageStatus[] response = mandrillApi.messages().send(new MandrillMessageParam());
		Assert.assertEquals(0, response.length);
	}
}
