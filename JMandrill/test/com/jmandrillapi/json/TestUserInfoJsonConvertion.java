package com.jmandrillapi.json;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jmandrillapi.model.MandrillObjectMapper;
import com.jmandrillapi.model.MandrillUserInfo;

public class TestUserInfoJsonConvertion {

	private static final MandrillObjectMapper objMapper = new MandrillObjectMapper();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testUserInfoDeSerilization() throws JsonParseException, JsonMappingException, IOException {

		String test = objMapper.writeValueAsString(getUserInfoBasic());

		MandrillUserInfo user = objMapper.readValue(test.getBytes(), MandrillUserInfo.class);
		System.out.println(user);
		assertNotNull(user);
	}

	@Test
	public void testUserInfoWithStatsDeSerilization() throws IOException {
		String json = objMapper.writeValueAsString(getUserWithStats());
		MandrillUserInfo user = objMapper.readValue(json.getBytes(), MandrillUserInfo.class);
		System.out.println(user);
		assertNotNull(user.getStats());
	}

	public Map<String, Object> getUserInfoBasic() {
		Map<String, Object> info = new HashMap<>();
		info.put("username", "testing");
		info.put("created_at", "2013-05-10 15:30:27");
		info.put("public_id", "123091802831923");
		info.put("reputation", 43);
		info.put("hourly_quota", 42);
		info.put("backlog", 42);
		return info;
	}

	public Map<String, Object> getUserWithStats() {
		Map<String, Object> info = getUserInfoBasic();

		Map<String, Object> stats = new HashMap<>();
		stats.put("hard_bounces", 42);
		stats.put("rejects", 42);
		stats.put("open", 12);

		Map<String, Object> aggStats = new HashMap<String, Object>();
		aggStats.put("last_7_days", stats);

		info.put("stats", aggStats);

		return info;
	}

}
