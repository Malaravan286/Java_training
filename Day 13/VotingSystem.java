import java.util.*;
public class VotingSystem { public static void main(String[] args) { Map<String, Integer> votes = new HashMap<>(); votes.put("Alice", 0); votes.put("Bob", 0); votes.put("Alice", votes.get("Alice") + 1); votes.put("Bob", votes.get("Bob") + 1); votes.put("Alice", votes.get("Alice") + 1); System.out.println(votes); } }
