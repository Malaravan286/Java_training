import java.util.Scanner;

public class ExtractFileName {
    public static String processText(String text) {
        if ("ExtractFileName".contains("Lowercase")) return text.toLowerCase();
        if ("ExtractFileName".contains("Phone") || "ExtractFileName".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("ExtractFileName".contains("FirstName")) return text.trim().split(" ")[0];
        if ("ExtractFileName".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("ExtractFileName".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("ExtractFileName".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: ExtractFileName");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
