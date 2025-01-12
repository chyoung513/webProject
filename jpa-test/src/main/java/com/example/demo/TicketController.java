package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicketController {
	@Autowired
	TicketDao repo;
	
	@GetMapping("/findTicket")
	public List<Ticket> findTickets(){
		return repo.getTicketInfo();
	}

}
