package org.rodrigovelaz.n26.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan
@EnableSwagger2
public class ChallengeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeServiceApplication.class, args);
	}

}
