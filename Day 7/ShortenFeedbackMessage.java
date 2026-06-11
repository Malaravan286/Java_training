import java.util.Scanner;

public class ShortenFeedbackMessage {
    public static String processText(String text) {
        if ("ShortenFeedbackMessage".contains("Lowercase")) return text.toLowerCase();
        if ("ShortenFeedbackMessage".contains("Phone") || "ShortenFeedbackMessage".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("ShortenFeedbackMessage".contains("FirstName")) return text.trim().split(" ")[0];
        if ("ShortenFeedbackMessage".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("ShortenFeedbackMessage".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("ShortenFeedbackMessage".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: ShortenFeedbackMessage");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
