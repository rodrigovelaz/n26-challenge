package org.rodrigovelaz.n26.challenge.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Value("${spring.application.name}")
    private String applicationName;
	
	@Bean
	public Docket newsApi() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.rodrigovelaz"))
				.build();
	}
	
	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder()
				.title(this.applicationName)
				.description(this.applicationName)
				.contact(contact())
				.version("1.0.0")
				.build();
	}
	
	private Contact contact() {
		return new Contact("Rodrigo Velaz", "https://www.linkedin.com/in/rodrigo-velaz-58096422/", "rodrigo.velaz@gmail.com");
	}

}