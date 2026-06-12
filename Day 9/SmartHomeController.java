import java.util.Scanner;

public class SmartHomeController {
    interface SmartDevice {
        void operate(String value);
    }

    static class Light implements SmartDevice {
        public void operate(String value) {
            System.out.println("Turning on lights in " + value);
        }
    }

    static class Fan implements SmartDevice {
        public void operate(String value) {
            System.out.println("Adjusting fan speed in " + value);
        }
    }

    static class AirConditioner implements SmartDevice {
        public void operate(String value) {
            System.out.println("Cooling " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room: ");
        String room = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        SmartDevice[] services = {new Light(), new Fan(), new AirConditioner()};
        services[0].operate(room);
        services[1].operate(room);
        services[2].operate(room);
        scanner.close();
    }
}
