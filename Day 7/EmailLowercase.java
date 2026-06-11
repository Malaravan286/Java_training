import java.util.Scanner;

public class EmailLowercase {
    public static String processText(String text) {
        if ("EmailLowercase".contains("Lowercase")) return text.toLowerCase();
        if ("EmailLowercase".contains("Phone") || "EmailLowercase".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("EmailLowercase".contains("FirstName")) return text.trim().split(" ")[0];
        if ("EmailLowercase".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("EmailLowercase".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("EmailLowercase".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: EmailLowercase");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
