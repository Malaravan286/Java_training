import java.util.Scanner;

public class CountCharacterOccurrence {
    public static String processText(String text) {
        if ("CountCharacterOccurrence".contains("Lowercase")) return text.toLowerCase();
        if ("CountCharacterOccurrence".contains("Phone") || "CountCharacterOccurrence".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("CountCharacterOccurrence".contains("FirstName")) return text.trim().split(" ")[0];
        if ("CountCharacterOccurrence".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("CountCharacterOccurrence".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("CountCharacterOccurrence".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: CountCharacterOccurrence");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
