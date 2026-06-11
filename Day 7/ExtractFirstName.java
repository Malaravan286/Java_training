import java.util.Scanner;

public class ExtractFirstName {
    public static String processText(String text) {
        if ("ExtractFirstName".contains("Lowercase")) return text.toLowerCase();
        if ("ExtractFirstName".contains("Phone") || "ExtractFirstName".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("ExtractFirstName".contains("FirstName")) return text.trim().split(" ")[0];
        if ("ExtractFirstName".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("ExtractFirstName".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("ExtractFirstName".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: ExtractFirstName");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
