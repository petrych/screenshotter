package com.petrych.screenshotter.common.errorhandling;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.format.DateTimeFormatter;

public class DateTimeConstants {
	
	public static final String DATETIME_FORMAT = "dd-MM-yyyy HH:mm";
	
	public static LocalDateTimeSerializer LOCAL_DATETIME_SERIALIZER = new LocalDateTimeSerializer(
			DateTimeFormatter.ofPattern(DATETIME_FORMAT));
	
}
