import java.util.*;
public class CustomerSupportTicketSystem {
    static class Ticket { String title; int priority; Ticket(String title, int priority) { this.title = title; this.priority = priority; } }
    public static void main(String[] args) {
        PriorityQueue<Ticket> tickets = new PriorityQueue<>(Comparator.comparingInt((Ticket t) -> t.priority).reversed());
        tickets.add(new Ticket("Login issue", 3)); tickets.add(new Ticket("Payment failed", 5)); tickets.add(new Ticket("Profile update", 1));
        while (!tickets.isEmpty()) { Ticket t = tickets.poll(); System.out.println(t.title + " priority " + t.priority); }
    }
}
