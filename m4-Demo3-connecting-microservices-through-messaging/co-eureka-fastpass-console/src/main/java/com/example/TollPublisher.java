package com.example;

import java.util.Random;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(TollSource.class)
public class TollPublisher {
	Random r = new Random();
	
	@Bean
	public MessageSource<Toll> sendTollCharge() {
		return () -> MessageBuilder.withPayload(new Toll("20","100","2017-07-12T12:04:00")).setHeader("speed", r.nextInt(8) * 10).build();			
	}
	
	class Toll {
		public String stationId;
		public String customerId;
		public String timestamp;
		
		public Toll(String StationId, String CustomerId, String Timestamp) {
			this.stationId = StationId;
			this.customerId = CustomerId;
			this.timestamp = Timestamp;
		}
	}
}
