import java.util.*;
public class BrowserHistoryList { public static void main(String[] args) { LinkedList<String> history = new LinkedList<>(); history.add("home.com"); history.add("mail.com"); history.add("news.com"); System.out.println("Current page: " + history.getLast()); System.out.println("Back to: " + history.get(history.size() - 2)); } }
