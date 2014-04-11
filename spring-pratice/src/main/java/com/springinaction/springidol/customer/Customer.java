package com.springinaction.springidol.customer;

/**
 * @author hubery.chen
 */
public class Customer {

    private int ticket;

    public Customer(int ticket) {
        this.ticket = ticket;
    }

    public void printTicket() {
        System.out.println("You have the " + ticket + "th ticket.");
    }

}
