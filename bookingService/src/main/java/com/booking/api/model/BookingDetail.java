package com.booking.api.model;

public class BookingDetail {
	
	private String emailNotification;
	private String paymentNotification;
	
	public String getEmailNotification() {
		return emailNotification;
	}
	public void setEmailNotification(String emailNotification) {
		this.emailNotification = emailNotification;
	}
	public String getPaymentNotification() {
		return paymentNotification;
	}
	public void setPaymentNotification(String paymentNotification) {
		this.paymentNotification = paymentNotification;
	}
	@Override
	public String toString() {
		return "BookingDetail [emailNotification=" + emailNotification + ", paymentNotification=" + paymentNotification
				+ "]";
	}

}
