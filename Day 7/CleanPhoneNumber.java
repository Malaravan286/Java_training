import java.util.Scanner;

public class CleanPhoneNumber {
    public static String processText(String text) {
        if ("CleanPhoneNumber".contains("Lowercase")) return text.toLowerCase();
        if ("CleanPhoneNumber".contains("Phone") || "CleanPhoneNumber".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("CleanPhoneNumber".contains("FirstName")) return text.trim().split(" ")[0];
        if ("CleanPhoneNumber".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("CleanPhoneNumber".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("CleanPhoneNumber".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: CleanPhoneNumber");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
