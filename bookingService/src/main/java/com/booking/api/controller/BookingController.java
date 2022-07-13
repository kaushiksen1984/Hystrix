package com.booking.api.controller;

import com.booking.api.model.BookingDetail;
import com.booking.api.service.BookingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@EnableHystrix
@EnableHystrixDashboard
public class BookingController {
	
    @Autowired
    private BookingService bookingService;

    @GetMapping("/bookTickets")
    public BookingDetail bookMyTicket() {
        return bookingService.getBookingdetail();
    }
}
