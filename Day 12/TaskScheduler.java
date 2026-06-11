import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> tasks = new LinkedList<>();

        while (true) {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task");
            System.out.println("2. Process Next Task");
            System.out.println("3. View Pending Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    tasks.add(scanner.nextLine());
                    System.out.println("Task added.");
                    break;
                case 2:
                    String task = tasks.poll();
                    if (task == null) {
                        System.out.println("No pending tasks.");
                    } else {
                        System.out.println("Processing task: " + task);
                    }
                    break;
                case 3:
                    System.out.println("Pending tasks: " + tasks);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
