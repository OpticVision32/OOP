package OCP;

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}
