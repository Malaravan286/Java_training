import java.util.*;
public class BrowserHistorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Stack<String> backStack = new Stack<>();
        System.out.print("Enter pages visited count: "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) { System.out.print("URL: "); backStack.push(sc.nextLine()); }
        System.out.println("Going back through history:"); while (!backStack.empty()) System.out.println(backStack.pop()); sc.close();
    }
}
