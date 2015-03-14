package com.jmandrillapi.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.Properties;

import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;

import com.jmandrillapi.MandrillApi;

public abstract class MandrillBaseApiTestCase {

	protected static MandrillApi mandrillApi;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String apiKey = getApiKey();

		if (apiKey != null)
			mandrillApi = new MandrillApi(apiKey);
		else
			mandrillApi = null;
	}

	@Before
	public final void beforeRun(){
		Assume.assumeNotNull(mandrillApi);
	}

	protected static final String getApiKey() {

		try {
			String propertyFileName = "mandrill.properties";
			InputStream stream = MandrillBaseApiTestCase.class.getClassLoader().getResourceAsStream(propertyFileName);
			if (stream == null) {
				throw new FileNotFoundException(propertyFileName + " file does not exists");
			}

			Properties prop = new Properties();
			prop.load(stream);

			String apiKey = (String) prop.get("apiKey");
			if (apiKey == null)
				throw new InvalidParameterException("invalid api key property");

			return apiKey;
		} catch (IOException e) {
			return null;
		}
	}

}
