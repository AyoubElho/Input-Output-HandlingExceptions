public class Vehicle {

    // Empty constructor
    public Vehicle() {
    }

    // Method testSpeed
    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        }
        System.out.println("Speed is acceptable: " + speed);
    }

    // Main method
    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        try {
            v.testSpeed(70);   // normal speed
            v.testSpeed(120);  // too fast
        } catch (TooFastException e) {
            e.printStackTrace(); // display call stack
        }
    }
}
