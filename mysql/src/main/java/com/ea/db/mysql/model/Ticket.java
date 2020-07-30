package com.ea.db.mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Long id;
    private double amount;
    private String category;

    public Ticket() {
    }

    public Ticket(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
