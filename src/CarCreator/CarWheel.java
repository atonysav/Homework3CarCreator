package CarCreator;

import java.util.Random;

public class CarWheel {
    private float wheelStatus;

    static Random myRandom = new Random();

    static float randomWheelStatus() {
        float value = myRandom.nextFloat();
        return value;
    }

    public CarWheel() {
        this.wheelStatus = randomWheelStatus();
    }

    public CarWheel(float wheelStatus) {
        this.wheelStatus = wheelStatus;
    }

    public void wheelInfo() {
        System.out.println("Wheel status is : " + wheelStatus);
    }

    public void changeWheelOnNew() {
        wheelStatus = 1.0f;
    }

    public void eraseWheel(Integer eraseProcent){
        wheelStatus = wheelStatus - wheelStatus*eraseProcent/100;
    }

    public float getWheelStatus() {
        return wheelStatus;
    }
}
