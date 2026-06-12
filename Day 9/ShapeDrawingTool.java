import java.util.Scanner;

public class ShapeDrawingTool {
    interface Drawable {
        void draw(String value);
    }

    static class Circle implements Drawable {
        public void draw(String value) {
            System.out.println("Drawing circle with color " + value);
        }
    }

    static class Rectangle implements Drawable {
        public void draw(String value) {
            System.out.println("Drawing rectangle with color " + value);
        }
    }

    static class Triangle implements Drawable {
        public void draw(String value) {
            System.out.println("Drawing triangle with color " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        Drawable[] services = {new Circle(), new Rectangle(), new Triangle()};
        services[0].draw(color);
        services[1].draw(color);
        services[2].draw(color);
        scanner.close();
    }
}
