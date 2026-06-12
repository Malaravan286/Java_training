import java.util.Scanner;

public class TransportTicketBookingSystem {
    interface TicketBooking {
        void book(String value);
    }

    static class BusTicket implements TicketBooking {
        public void book(String value) {
            System.out.println("Booking bus ticket for " + value);
        }
    }

    static class TrainTicket implements TicketBooking {
        public void book(String value) {
            System.out.println("Booking train ticket for " + value);
        }
    }

    static class FlightTicket implements TicketBooking {
        public void book(String value) {
            System.out.println("Booking flight ticket for " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger: ");
        String passenger = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        TicketBooking[] services = {new BusTicket(), new TrainTicket(), new FlightTicket()};
        services[0].book(passenger);
        services[1].book(passenger);
        services[2].book(passenger);
        scanner.close();
    }
}
