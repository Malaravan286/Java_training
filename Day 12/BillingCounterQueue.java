import java.util.*;
public class BillingCounterQueue { public static void main(String[] args) { Queue<String> queue = new LinkedList<>(); queue.add("Customer 1"); queue.add("Customer 2"); queue.add("Customer 3"); while (!queue.isEmpty()) System.out.println("Billing: " + queue.poll()); } }
