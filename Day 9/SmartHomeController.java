interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart light is ON.");
    }

    public void turnOff() {
        System.out.println("Smart light is OFF.");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart fan is ON.");
    }

    public void turnOff() {
        System.out.println("Smart fan is OFF.");
    }
}

class SmartAc implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart AC is cooling the room.");
    }

    public void turnOff() {
        System.out.println("Smart AC is OFF.");
    }
}

public class SmartHomeController {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartLight(),
            new SmartFan(),
            new SmartAc()
        };

        for (SmartDevice device : devices) {
            device.turnOn();
            device.turnOff();
        }
    }
}
