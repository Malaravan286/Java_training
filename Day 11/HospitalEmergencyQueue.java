import java.util.*;
public class HospitalEmergencyQueue {
    static class Patient { String name; int severity; Patient(String name, int severity) { this.name = name; this.severity = severity; } }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); PriorityQueue<Patient> queue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> p.severity).reversed());
        System.out.print("How many patients? "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) { System.out.print("Patient name: "); String name = sc.nextLine(); System.out.print("Severity 1-10: "); int severity = sc.nextInt(); sc.nextLine(); queue.add(new Patient(name, severity)); }
        while (!queue.isEmpty()) { Patient p = queue.poll(); System.out.println("Treating: " + p.name + " severity " + p.severity); } sc.close();
    }
}
