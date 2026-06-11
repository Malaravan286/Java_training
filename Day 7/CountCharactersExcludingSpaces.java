import java.util.Scanner;

public class CountCharactersExcludingSpaces {
    public static String processText(String text) {
        if ("CountCharactersExcludingSpaces".contains("Lowercase")) return text.toLowerCase();
        if ("CountCharactersExcludingSpaces".contains("Phone") || "CountCharactersExcludingSpaces".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("CountCharactersExcludingSpaces".contains("FirstName")) return text.trim().split(" ")[0];
        if ("CountCharactersExcludingSpaces".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("CountCharactersExcludingSpaces".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("CountCharactersExcludingSpaces".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: CountCharactersExcludingSpaces");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
