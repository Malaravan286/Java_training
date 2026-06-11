import java.util.Scanner;

public class ContinuousNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        int count = 1;
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ("ContinuousNumberTriangle".contains("Hollow") && i > 1 && i < n && j > 1 && j < n) {
                    System.out.print("  ");
                } else if ("ContinuousNumberTriangle".contains("Number")) {
                    System.out.print((count++) + " ");
                } else if ("ContinuousNumberTriangle".contains("Alphabet")) {
                    System.out.print(letter + " ");
                    letter = letter == 'Z' ? 'A' : (char)(letter + 1);
                } else if ("ContinuousNumberTriangle".contains("Binary")) {
                    System.out.print(((i + j) % 2) + " ");
                } else if ("ContinuousNumberTriangle".contains("Odd")) {
                    System.out.print((count * 2 - 1) + " ");
                    count++;
                } else if ("ContinuousNumberTriangle".contains("Even")) {
                    System.out.print((count * 2) + " ");
                    count++;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
