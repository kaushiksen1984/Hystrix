package com.notification.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailServiceController {
	
	@GetMapping("/sendEmail")
	public String sendEmail() {
		return "email sent..";
	}

}
