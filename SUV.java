package vehicleApp;

public class SUV extends Car {

    // Constructor
    public SUV(String name, boolean isManual) {
        super(name, 4, "SUV", 5, 6, isManual); // Default SUV configuration
    }

    // Accelerate the SUV, adjusting the gear based on speed
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed <= 30) {
            changeGear(3);
        } else if (newSpeed <= 50) {
            changeGear(4);
        } else if (newSpeed <= 70) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        // If speed is greater than 0, move the vehicle
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
