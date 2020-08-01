package com.ea.db.mysql.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
public class Ticket  {

//    @Id
//    @GeneratedValue
    private Long id;
    private double amount;
    private String category;


    public Ticket(double amount, String category) {
        super();
        this.amount = amount;
        this.category = category;
    }

}
