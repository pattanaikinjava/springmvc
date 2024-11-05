package com.pattanaik.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pattanaik.ticketbooking.model.Ticket;
import com.pattanaik.ticketbooking.service.TicketService;

@RestController
@RequestMapping(value="/tickets")
/* 
 * Access url - http://localhost:8080/tickets
 * */
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	//Get all tickets
	/* 
	 * Access url - http://localhost:8080/tickets/all
	 * */
	@GetMapping(value="/all")
	public Iterable<Ticket> getTickets(){ 
		return ticketService.getAllTickets();
	}
	

	//Get a particular ticket
	/* 
	 * Access url - http://localhost:8080/tickets/1
	 *               http://localhost:8080/tickets/2
	 *                http://localhost:8080/tickets/3
	 * */
	@GetMapping(value="/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId){ 
		return ticketService.getParticularTicket(ticketId);
	}
	
	//create ticket
	/* 
	 * Access url - http://localhost:8080/tickets/create
	 * */
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticketList) { 
		return ticketService.createTicket(ticketList);
	}
	
	//update ticket
	/* 
	 * Access url - http://localhost:8080/tickets/1/abc@gmail.com
	 *            - http://localhost:8080/tickets/2/pat@gmail.com
	 * */
	@PutMapping(value="/{ticketId}/{updatedEmail}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,
		                       @PathVariable("updatedEmail") String updatedEmail) {
		return ticketService.updateTicket(updatedEmail, ticketId);
	}
	
	//delete ticket
	/* 
	 * Access url - http://localhost:8080/tickets/1
	 * */
    @DeleteMapping(value="/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId) { 
    	ticketService.deleteTicket(ticketId);
    }
}
