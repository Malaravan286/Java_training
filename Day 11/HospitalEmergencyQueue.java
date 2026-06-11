import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {
    String name;
    int emergencyLevel;

    Patient(String name, int emergencyLevel) {
        this.name = name;
        this.emergencyLevel = emergencyLevel;
    }
}

public class HospitalEmergencyQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<Patient>(new Comparator<Patient>() {
            public int compare(Patient first, Patient second) {
                return second.emergencyLevel - first.emergencyLevel;
            }
        });

        queue.add(new Patient("Ravi", 2));
        queue.add(new Patient("Meena", 5));
        queue.add(new Patient("John", 3));

        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Treating " + patient.name + " with emergency level " + patient.emergencyLevel);
        }
    }
}
