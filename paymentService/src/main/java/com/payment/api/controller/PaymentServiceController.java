package com.payment.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {

	@GetMapping("/makePayment")
	public String makePayment() {
		return "Payment made..";
	}
}
