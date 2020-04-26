package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class CoStreamTollintakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoStreamTollintakeApplication.class, args);
	}

	@StreamListener(target = Sink.INPUT)
	public void logfast(String msg) {
		System.out.println("fast = " + msg);
	}
}
