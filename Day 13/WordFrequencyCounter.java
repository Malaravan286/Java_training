import java.util.*;
public class WordFrequencyCounter { public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.print("Enter sentence: "); String[] words = sc.nextLine().toLowerCase().split("\\s+"); Map<String, Integer> count = new HashMap<>(); for (String word : words) count.put(word, count.getOrDefault(word, 0) + 1); System.out.println(count); sc.close(); } }
