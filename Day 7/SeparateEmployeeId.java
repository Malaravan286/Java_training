import java.util.Scanner;

public class SeparateEmployeeId {
    public static String processText(String text) {
        if ("SeparateEmployeeId".contains("Lowercase")) return text.toLowerCase();
        if ("SeparateEmployeeId".contains("Phone") || "SeparateEmployeeId".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("SeparateEmployeeId".contains("FirstName")) return text.trim().split(" ")[0];
        if ("SeparateEmployeeId".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("SeparateEmployeeId".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("SeparateEmployeeId".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: SeparateEmployeeId");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
