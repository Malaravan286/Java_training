class Ride {
    private String pickup;
    private String drop;

    Ride(String pickup, String drop) {
        this.pickup = pickup;
        this.drop = drop;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDrop() {
        return drop;
    }

    public double calculateFare() {
        return 0;
    }
}

class BikeRide extends Ride {
    BikeRide(String pickup, String drop) {
        super(pickup, drop);
    }

    public double calculateFare() {
        return 80;
    }
}

class CarRide extends Ride {
    CarRide(String pickup, String drop) {
        super(pickup, drop);
    }

    public double calculateFare() {
        return 180;
    }
}

public class RideBookingApplication {
    public static void main(String[] args) {
        Ride[] rides = {
            new BikeRide("College", "Bus Stand"),
            new CarRide("Home", "Airport")
        };

        for (Ride ride : rides) {
            System.out.println("Ride from " + ride.getPickup() + " to " + ride.getDrop()
                    + " costs Rs." + ride.calculateFare());
        }
    }
}
