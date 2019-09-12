package CarCreator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Car {
    private final int manufactured;
    private String engineType;
    private int maxSpeed;
    private int maxSpeedOfNewCar;
    private int accelerationTimeTo100KM;
    private int passengersMaxCount;
    private int passengersInCar;
    private int currentSpeed;
    private int wheelsCount;
    private int doorsCount;
    private CarWheel[] wheels;
    private CarDoor[] doors;


    public Car(int manufactured) {
        Random random = new Random();
        this.manufactured = manufactured;
        this.engineType = "Semi - auto";
        this.maxSpeed = 150 + random.nextInt(200 - 150);
        this.maxSpeedOfNewCar = 200 + random.nextInt(220-200);
        this.accelerationTimeTo100KM = 10 + random.nextInt(15 - 10);
        this.passengersMaxCount = 5 + random.nextInt(7 - 5);
        this.passengersInCar = 1 + random.nextInt(passengersMaxCount - 1);
        this.currentSpeed = 60 + random.nextInt(maxSpeed - 60);
        this.wheelsCount = 4 + random.nextInt(6 - 4);
        this.doorsCount = 3 + random.nextInt(5 - 3);
        this.wheels = new CarWheel[wheelsCount];
        this.doors = new CarDoor[doorsCount];
        for (int i = 0; i < wheelsCount; i++) {
            this.wheels[i] = new CarWheel();
        }
        for (int i = 0; i < doorsCount; i++) {
            this.doors[i] = new CarDoor();
        }
    }

    public Car(int manufactured, String engineType, int maxSpeed, int maxSpeedOfNewCar, int accelerationTimeTo100KM, int passengersMaxCount, int passengersInCar, int currentSpeed, int wheelCount, int doorCount) {
        this.manufactured = manufactured;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.maxSpeedOfNewCar = maxSpeedOfNewCar;
        this.accelerationTimeTo100KM = accelerationTimeTo100KM;
        this.passengersMaxCount = passengersMaxCount;
        this.passengersInCar = passengersInCar;
        this.currentSpeed = currentSpeed;
        this.wheelsCount = wheelCount;
        this.doorsCount = doorCount;
        this.wheels = new CarWheel[wheelsCount];
        this.doors = new CarDoor[doorsCount];
        this.doors = new CarDoor[doorsCount];
        for (int i = 0; i < wheelsCount; i++) {
            this.wheels[i] = new CarWheel();
        }
        for (int i = 0; i < doorsCount; i++) {
            this.doors[i] = new CarDoor();
        }
    }

    public void changeCurrentSpeed(Integer newSpeed) {
        if (newSpeed < maxSpeed) {
            currentSpeed = newSpeed;
        } else {
            currentSpeed = maxSpeed;
            System.out.println("Your speed can not be bigger then max. Your current speed : " + maxSpeed);
        }
    }

    public void pickUpOnePassenger() {
        if (passengersInCar < passengersMaxCount) {
            passengersInCar += 1;
        } else {
            passengersInCar = passengersMaxCount;
            System.out.println("You can not pick up passengers. Car if full. Current passengers count : " + passengersInCar);
        }
    }

    public void dropOffOnePassenger() {
        passengersInCar -= 1;
    }

    public void dropOffAllPassenger() {
        passengersInCar = 0;
    }

    public CarWheel getCarWheel(Integer index) {
        return wheels[index];
    }

    public CarDoor getCarDoor(Integer index) {
        return doors[index];
    }

    public void takeOffAllWheels() {
        wheelsCount = 0;
        wheels = new CarWheel[wheelsCount];
    }

    public void addNewWheels(Integer countOfNewWheels) {
        CarWheel[] newCarWheels = new CarWheel[countOfNewWheels];
        wheels = Arrays.copyOf(wheels, wheels.length + newCarWheels.length);
        for (int i = 0; i < countOfNewWheels; i++) {
            wheels[wheelsCount + i] = new CarWheel();
        }
        wheelsCount = wheelsCount + countOfNewWheels;
    }

    public void calculateCurrentMaxSpeed() {
        float baddestWheelStatus;

        if (passengersInCar > 0 && wheelsCount != 0) {
            baddestWheelStatus = wheels[0].getWheelStatus();
            for (int i = 1; i < wheelsCount; i++) {
                if (baddestWheelStatus > wheels[i].getWheelStatus()) {
                    baddestWheelStatus = wheels[i].getWheelStatus();
                }
            }
            maxSpeed = (int) (maxSpeedOfNewCar * baddestWheelStatus);
        } else if (wheelsCount==0){
            maxSpeed = 0;
        }
        else {
            maxSpeed = 0;
        }
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }

    public void carInfo() {
        System.out.println("manufactured : " + manufactured);
        System.out.println("engineType : " + engineType);
        System.out.println("current maxSpeed : " + maxSpeed);
        System.out.println("maxSeed of new Car : " + maxSpeedOfNewCar);
        System.out.println("accelerationTimeTo100KM : " + accelerationTimeTo100KM);
        System.out.println("passengersMaxCount : " + passengersMaxCount);
        System.out.println("passengersInCar : " + passengersInCar);
        System.out.println("currentSpeed : " + currentSpeed);
        System.out.println("wheelsCount : " + wheelsCount);
        System.out.println("doorsCount : " + doorsCount);

    }

}
