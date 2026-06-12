import java.util.*;

public class HospitalTokenSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        int choice;

        System.out.println("Hospital Token System");
        do {
            System.out.println("1 Add item  2 Insert at index  3 Add to queue  4 Process queue  5 Display  0 Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter item: ");
                    list.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter item: ");
                    String item = scanner.nextLine();
                    if (index >= 0 && index <= list.size()) list.add(index, item);
                    else System.out.println("Invalid index");
                    break;
                case 3:
                    System.out.print("Enter queue item: ");
                    queue.offer(scanner.nextLine());
                    break;
                case 4:
                    System.out.println(queue.isEmpty() ? "Queue is empty" : "Processed: " + queue.poll());
                    break;
                case 5:
                    System.out.println("List: " + list);
                    System.out.println("Queue: " + queue);
                    break;
                case 0:
                    System.out.println("Program ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
