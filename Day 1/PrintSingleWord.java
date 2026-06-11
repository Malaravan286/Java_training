import java.util.Scanner;

public class PrintSingleWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single word: ");
        String word = scanner.next();
        System.out.println("Word: " + word);
        scanner.close();
    }
}
