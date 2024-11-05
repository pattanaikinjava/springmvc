package com.pattanaik.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;

import com.pattanaik.ticketbooking.model.Ticket;

public interface TicketDao 
                 extends 
                        CrudRepository<Ticket, Integer> {

}
