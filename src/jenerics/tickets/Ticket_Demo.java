package jenerics.tickets;

public class Ticket_Demo {
    public static void main(String[] args) {
        com_ticket[] tickets = new com_ticket[]{
                new com_ticket(1, "One_way", "USA","29.10.2019"),
                new com_ticket( 2, "Return ticket",  "UK", "29.10.2019")
        };

        PurchTicketSystem<com_ticket> purchTicketSystem = new PurchTicketSystem<>(tickets);
        purchTicketSystem.purchTicketInfo();
    }
}
