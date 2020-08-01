package com.ea.db.mysql.dao;

import com.ea.db.mysql.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
//    Ticket findByUsername(String username);

}
