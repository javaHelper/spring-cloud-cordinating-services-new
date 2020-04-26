package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.filters.ProxyFilter;
import com.example.filters.StartPreFilter;
import com.example.filters.StopPostFilter;


@EnableZuulProxy
@SpringBootApplication
public class CoZuulApiproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoZuulApiproxyApplication.class, args);
	}

	@Bean
	public ProxyFilter proxyFilter() {
		return new ProxyFilter();
	}
	
	@Bean
	public StartPreFilter startPreFilter() {
		return new StartPreFilter();
	}
	
	@Bean
	public StopPostFilter stopPostFilter() {
		return new StopPostFilter();
	}
}
