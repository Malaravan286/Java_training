import java.util.Scanner;

public class HourglassStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        int count = 1;
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ("HourglassStars".contains("Hollow") && i > 1 && i < n && j > 1 && j < n) {
                    System.out.print("  ");
                } else if ("HourglassStars".contains("Number")) {
                    System.out.print((count++) + " ");
                } else if ("HourglassStars".contains("Alphabet")) {
                    System.out.print(letter + " ");
                    letter = letter == 'Z' ? 'A' : (char)(letter + 1);
                } else if ("HourglassStars".contains("Binary")) {
                    System.out.print(((i + j) % 2) + " ");
                } else if ("HourglassStars".contains("Odd")) {
                    System.out.print((count * 2 - 1) + " ");
                    count++;
                } else if ("HourglassStars".contains("Even")) {
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
