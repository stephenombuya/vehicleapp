package vehicleApp;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    // Constructor
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    // Steering the vehicle by a specified direction
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steering at " + currentDirection + " degrees.");
    }

    // Moving the vehicle with a specified speed and direction
    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Moving at " + currentSpeed + " km/h in direction " + currentDirection + " degrees.");
    }

    // Stop the vehicle
    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Vehicle has stopped.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
