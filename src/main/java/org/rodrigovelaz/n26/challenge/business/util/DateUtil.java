package org.rodrigovelaz.n26.challenge.business.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.TimeZone;

public class DateUtil {

	public static LocalDateTime convertToLocalDateTime(Long timestamp) {
		return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), TimeZone.getDefault().toZoneId());
	}
	
	public static Long converToTimeStamp(LocalDateTime localDateTime) {
		return localDateTime.toEpochSecond(ZoneOffset.UTC) * 1000;
	}
	
}
