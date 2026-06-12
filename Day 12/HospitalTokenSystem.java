import java.util.*;
public class HospitalTokenSystem { public static void main(String[] args) { Queue<Integer> tokens = new LinkedList<>(); for (int i = 101; i <= 105; i++) tokens.offer(i); System.out.println("Next token: " + tokens.poll()); System.out.println("Waiting tokens: " + tokens); } }
