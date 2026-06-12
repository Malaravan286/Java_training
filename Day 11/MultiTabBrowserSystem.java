import java.util.*;
public class MultiTabBrowserSystem {
    public static void main(String[] args) {
        LinkedList<String> tabs = new LinkedList<>(); tabs.add("Home"); tabs.add("Search"); tabs.add("Mail");
        tabs.addFirst("Dashboard"); tabs.removeLast(); System.out.println("Open tabs: " + tabs);
    }
}
