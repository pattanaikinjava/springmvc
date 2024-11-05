package com.pattanaik.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pattanaik.ticketbooking.dao.TicketDao;
import com.pattanaik.ticketbooking.model.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	//create new ticket
	/* 
	 *  INSERT QUERY - insert into tbl_ticket(columns) values(data)
	 * */
	public Ticket createTicket(Ticket ticketList) { 
		return ticketDao.save(ticketList);
	}
	
	//Get all ticket
	/* 
	 * SELECT QUERY - select * from tbl_ticket
	 * */
	public Iterable<Ticket> getAllTickets(){ 
		return ticketDao.findAll();
	}
	
	//Get a particular ticket
	/* 
	 * SELECT QUERY - select  from tbl_ticket where ticket_id = ticketId
	 * */
	public Ticket getParticularTicket(Integer ticketId) {
		return ticketDao.findById(ticketId). //If ticketId exists, then fetched
				orElse(                      // If ticketId not exists, new ticket will be created
						new Ticket()
				      )  ;
				
	}
	//update existing ticket
	/*
	 * UPDATE QUERY - update tbl_ticket set column = value where ticket_id = ticketId
	 * */
	public Ticket updateTicket(String upadtedEmail, Integer ticketId) {
		Ticket specificTicket = getParticularTicket(ticketId);
		specificTicket.setEmail(upadtedEmail);
        return ticketDao.save(specificTicket);
	}
	
	//delete ticket
	/*
	 * DELETE QUERY - delete from tbl_ticket where ticket_id = ticketId
	 */
	public void deleteTicket(Integer ticketId) { 
		 ticketDao.deleteById(ticketId);
	}
}
