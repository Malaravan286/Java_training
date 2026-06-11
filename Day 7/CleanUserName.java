import java.util.Scanner;

public class CleanUserName {
    public static String processText(String text) {
        if ("CleanUserName".contains("Lowercase")) return text.toLowerCase();
        if ("CleanUserName".contains("Phone") || "CleanUserName".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("CleanUserName".contains("FirstName")) return text.trim().split(" ")[0];
        if ("CleanUserName".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("CleanUserName".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("CleanUserName".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: CleanUserName");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
