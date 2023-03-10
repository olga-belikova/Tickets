package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(1, 300, "MSK", "SPB", 120 );
    Ticket ticket2 = new Ticket(2, 500, "UFA", "MRV", 92 );
    Ticket ticket3 = new Ticket(3, 200, "MSK", "SPB", 90 );
    Ticket ticket4 = new Ticket(4, 600, "MRV", "MSK", 200 );
    Ticket ticket5 = new Ticket(5, 400, "MSK", "ARH", 320 );
    Ticket ticket6 = new Ticket(6, 100, "MSK", "SPB", 100 );
    Ticket ticket7 = new Ticket(7, 700, "MSK", "AER", 98 );
    Ticket ticket8 = new Ticket(8, 200, "MSK", "SPB", 100 );

    @Test
    public void shouldSearchAndSort() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket6, ticket3, ticket8, ticket1};
        Ticket[] actual = manager.searchBy("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchOneResults() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2};
        Ticket[] actual = manager.searchBy("UFA", "MRV");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchNoResult() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.searchBy("SPB", "MSK");

        Assertions.assertArrayEquals(expected, actual);
    }
}
