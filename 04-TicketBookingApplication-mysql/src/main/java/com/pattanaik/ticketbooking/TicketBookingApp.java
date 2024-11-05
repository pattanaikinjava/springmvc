package com.pattanaik.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pattanaik.ticketbooking.model.Ticket;
import com.pattanaik.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApp  implements CommandLineRunner{

	@Autowired
	private TicketService ticket_service;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//creating dummy ticket when application runs
		Ticket ticketObj = new Ticket();
		ticketObj.setPassengerName("Deb Pattnaik");
		ticketObj.setDestinationStation("Hyderabad");
		ticketObj.setSourceStation("Odisha");
		ticketObj.setEmail("dp@gmail.com");
		ticketObj.setTravelDate(new Date());
		ticket_service.createTicket(ticketObj);
		
	}

}
