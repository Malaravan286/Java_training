import java.util.*;

public class MultiTabBrowserSystem {
    static class Entry {
        String name;
        int priority;

        Entry(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String toString() {
            return name + "(priority " + priority + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Entry> records = new ArrayList<>();
        LinkedList<String> recentActions = new LinkedList<>();
        Stack<String> undoStack = new Stack<>();
        PriorityQueue<Entry> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.priority));

        System.out.println("Multi Tab Browser System");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter priority/rank: ");
            int priority = Integer.parseInt(scanner.nextLine());
            Entry entry = new Entry(name, priority);
            records.add(entry);
            recentActions.addFirst("Added " + name);
            undoStack.push(name);
            queue.offer(entry);
        }

        records.sort(Comparator.comparingInt(e -> e.priority));
        System.out.println("Sorted records: " + records);
        System.out.println("Recent actions: " + recentActions);
        System.out.println("Last undo item: " + undoStack.pop());
        System.out.println("Highest priority item: " + queue.poll());
    }
}
