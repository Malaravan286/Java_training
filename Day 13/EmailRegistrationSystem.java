import java.util.*;
public class EmailRegistrationSystem { public static void main(String[] args) { Scanner sc = new Scanner(System.in); Set<String> emails = new HashSet<>(); for (int i = 0; i < 3; i++) { System.out.print("Email: "); String email = sc.nextLine(); System.out.println(emails.add(email) ? "Registered" : "Already exists"); } sc.close(); } }
