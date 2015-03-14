/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.jmandrillapi.utils.MandrillConstants;

/**
 * The Class MandrillObjectMapper.
 */
public class MandrillObjectMapper extends ObjectMapper {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1L;

	/**
	 * Instantiates a new mandrill object mapper.
	 */
	public MandrillObjectMapper() {
		this.setSerializationInclusion(Include.NON_NULL);
		this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		VisibilityChecker<?> checker = this.getVisibilityChecker();
		checker.withFieldVisibility(Visibility.ANY).withGetterVisibility(Visibility.NONE).withIsGetterVisibility(Visibility.NONE)
				.withSetterVisibility(Visibility.NONE).withCreatorVisibility(Visibility.NONE);

		this.setVisibilityChecker(checker);

		SimpleDateFormat fmt = new SimpleDateFormat(MandrillConstants.MANDRILL_DATE_FORMAT);
		fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
		this.setDateFormat(fmt);
	}
}
