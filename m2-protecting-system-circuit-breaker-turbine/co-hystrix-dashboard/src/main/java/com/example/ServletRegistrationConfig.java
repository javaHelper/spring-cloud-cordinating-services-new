package com.example;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;

@Configuration
public class ServletRegistrationConfig {
	@Bean
	public ServletRegistrationBean registerTurbineBean() {
		return new ServletRegistrationBean(new TurbineStreamServlet(), "/turbine.stream");
	}
}