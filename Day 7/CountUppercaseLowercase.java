import java.util.Scanner;

public class CountUppercaseLowercase {
    public static String processText(String text) {
        if ("CountUppercaseLowercase".contains("Lowercase")) return text.toLowerCase();
        if ("CountUppercaseLowercase".contains("Phone") || "CountUppercaseLowercase".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("CountUppercaseLowercase".contains("FirstName")) return text.trim().split(" ")[0];
        if ("CountUppercaseLowercase".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("CountUppercaseLowercase".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("CountUppercaseLowercase".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: CountUppercaseLowercase");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
