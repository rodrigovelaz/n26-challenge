package org.rodrigovelaz.n26.challenge.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggerConfig {

	@Bean
	public Filter commonsRequestLoggingFilter() {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludeClientInfo(true);
	    filter.setIncludeQueryString(true);
	    filter.setIncludePayload(true);
	    filter.setMaxPayloadLength(1000);
	    return filter;
	}
	
}
