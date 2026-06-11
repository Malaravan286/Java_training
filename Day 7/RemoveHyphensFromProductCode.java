import java.util.Scanner;

public class RemoveHyphensFromProductCode {
    public static String processText(String text) {
        if ("RemoveHyphensFromProductCode".contains("Lowercase")) return text.toLowerCase();
        if ("RemoveHyphensFromProductCode".contains("Phone") || "RemoveHyphensFromProductCode".contains("Hyphens")) return text.replace("-", "").replace(" ", "");
        if ("RemoveHyphensFromProductCode".contains("FirstName")) return text.trim().split(" ")[0];
        if ("RemoveHyphensFromProductCode".contains("Reverse")) return new StringBuilder(text).reverse().toString();
        if ("RemoveHyphensFromProductCode".contains("Spaces")) return text.trim().replaceAll("\\s+", " ");
        if ("RemoveHyphensFromProductCode".contains("Shorten")) return text.length() <= 30 ? text : text.substring(0, 30) + "...";
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Program: RemoveHyphensFromProductCode");
        System.out.println("Output: " + processText(text));
        scanner.close();
    }
}
