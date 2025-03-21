package com.example.myapp;

public class Ticket {
    TicketType type;
    double cost;


    public Ticket(TicketType type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public void buy() {
        System.out.println("Buying " );
    }

    public void sell() {
        System.out.println("Selling " );
    }
}
