package OCP;

public class Car extends Vehicle{
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
