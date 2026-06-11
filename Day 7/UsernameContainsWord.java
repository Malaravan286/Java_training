import java.util.Scanner;

public class UsernameContainsWord {
    public static String processText(String text) {
        if ("UsernameContainsWord".contains("Lowercase")) return text.toLowerCase();
        if ("UsernameContainsWord".contains("Phone") || "UsernameContainsWord".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("UsernameContainsWord".contains("FirstName")) return text.trim().split(" ")[0];
        if ("UsernameContainsWord".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("UsernameContainsWord".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("UsernameContainsWord".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: UsernameContainsWord");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
