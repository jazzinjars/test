package com.jazzinjars.test.bdd.spring.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@Configuration
public class SpringMockFactory {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Bean
	@Scope("prototype")
	public MockMvc getMockMvc() {
		return webAppContextSetup(webApplicationContext).build();
	}
}
