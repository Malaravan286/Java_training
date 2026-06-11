import java.util.Scanner;

public class ReverseSentenceUsingStringBuilder {
    public static String processText(String text) {
        if ("ReverseSentenceUsingStringBuilder".contains("Lowercase")) return text.toLowerCase();
        if ("ReverseSentenceUsingStringBuilder".contains("Phone") || "ReverseSentenceUsingStringBuilder".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("ReverseSentenceUsingStringBuilder".contains("FirstName")) return text.trim().split(" ")[0];
        if ("ReverseSentenceUsingStringBuilder".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("ReverseSentenceUsingStringBuilder".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("ReverseSentenceUsingStringBuilder".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: ReverseSentenceUsingStringBuilder");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
