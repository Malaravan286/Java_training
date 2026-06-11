import java.util.Scanner;

public class CleanExtraSpaces {
    public static String processText(String text) {
        if ("CleanExtraSpaces".contains("Lowercase")) return text.toLowerCase();
        if ("CleanExtraSpaces".contains("Phone") || "CleanExtraSpaces".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("CleanExtraSpaces".contains("FirstName")) return text.trim().split(" ")[0];
        if ("CleanExtraSpaces".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("CleanExtraSpaces".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("CleanExtraSpaces".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: CleanExtraSpaces");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
