package com.jazzinjars.test.bdd.spring;

import cucumber.api.java.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration("classpath:cucumber.xml")
public class CucumberContextConfiguration {

	@Before
	public void setup_cucumber_spring_context() {
		// cucumber will recognize this class as glue and use its context configuration
	}
}
