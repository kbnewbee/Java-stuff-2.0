package com.ea.db.mysql.dao;

import com.ea.db.mysql.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Long> {

}
