import java.util.Stack;

public class BrowserHistorySystem {
    public static void main(String[] args) {
        Stack<String> history = new Stack<String>();

        history.push("google.com");
        history.push("java.com");
        history.push("placement-prep.com");

        System.out.println("Current page: " + history.peek());

        // pop() removes the most recent page, like pressing the Back button.
        history.pop();
        System.out.println("After going back: " + history.peek());
    }
}
