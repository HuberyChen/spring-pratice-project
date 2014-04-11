package com.springinaction.springidol.customer;

/**
 * @author hubery.chen
 */
public class Ticket {

    private int ticket = 0;

    public Ticket() {
        this.ticket++;
    }

    public static int printTicket() {
        return TicketSingletonHolder.ticket.getTicket();
    }

    public int getTicket() {
        return ticket;
    }

    private static class TicketSingletonHolder {
        static Ticket ticket = new Ticket();
    }
}
