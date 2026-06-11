import java.util.Scanner;

public class PalindromeUsingStringBuilder {
    public static String processText(String text) {
        if ("PalindromeUsingStringBuilder".contains("Lowercase")) return text.toLowerCase();
        if ("PalindromeUsingStringBuilder".contains("Phone") || "PalindromeUsingStringBuilder".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("PalindromeUsingStringBuilder".contains("FirstName")) return text.trim().split(" ")[0];
        if ("PalindromeUsingStringBuilder".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("PalindromeUsingStringBuilder".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("PalindromeUsingStringBuilder".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: PalindromeUsingStringBuilder");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
