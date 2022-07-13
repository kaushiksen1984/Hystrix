package com.booking.api.adapter;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExternalApiAdapter {
	
	@Autowired
	private RestTemplate restTemplate;
	@HystrixCommand(groupKey = "email service", commandKey = "email service", fallbackMethod = "getEmailFallback")
	public String getEmailServiceResponse() {
		return restTemplate.getForEntity("http://localhost:8080/email/sendEmail", String.class).getBody();
	}

	@HystrixCommand(groupKey = "payment service", commandKey = "payment service", fallbackMethod = "getPaymentFallback")
	public String getPaymentServiceResponse() {
		return restTemplate.getForEntity("http://localhost:8081/payment/makePayment", String.class).getBody();
	}

	public String getEmailFallback() {
		return "Email Service Failed...";
	}

	public String getPaymentFallback() {
		return "Payment Service Failed...";
	}

}
