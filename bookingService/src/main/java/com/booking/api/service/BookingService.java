package com.booking.api.service;

import com.booking.api.model.BookingDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.api.adapter.ExternalApiAdapter;

@Service
public class BookingService {
	
	@Autowired
	private ExternalApiAdapter externalApiAdapter;
	
	public BookingDetail getBookingdetail() {
		BookingDetail bookingDetail = new BookingDetail();
		bookingDetail.setEmailNotification(externalApiAdapter.getEmailServiceResponse());
		bookingDetail.setPaymentNotification(externalApiAdapter.getPaymentServiceResponse());
		return bookingDetail;
	}

}
