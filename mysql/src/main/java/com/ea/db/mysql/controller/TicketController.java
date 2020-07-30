package com.ea.db.mysql.controller;

import com.ea.db.mysql.dao.TicketDao;
import com.ea.db.mysql.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody Ticket ticket) {
        dao.save(ticket);
        return "tickets booked";
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return (List<Ticket>) dao.findAll();
    }
}
