import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordCount = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word frequencies: " + wordCount);
        scanner.close();
    }
}
