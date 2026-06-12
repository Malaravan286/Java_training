import java.util.*;
public class MovieTicketWaitingList { public static void main(String[] args) { Queue<String> waitingList = new LinkedList<>(); waitingList.offer("Ravi"); waitingList.offer("Meena"); waitingList.offer("John"); System.out.println("Ticket issued to: " + waitingList.poll()); System.out.println("Still waiting: " + waitingList); } }
