package CarCreator;

public class Main {
    public static void main(String[] args){

        Car car2 = new Car(1990, "semi-auto", 200, 220, 12, 6, 5, 90, 4, 5);
        car2.carInfo();
        car2.getCarDoor(0).doorInfo();
        car2.getCarWheel(2).wheelInfo();
        car2.changeCurrentSpeed(130);
        car2.pickUpOnePassenger();
        car2.pickUpOnePassenger();
        car2.takeOffAllWheels();
        car2.carInfo();
        car2.calculateCurrentMaxSpeed();
        car2.carInfo();
        car2.addNewWheels(4);
        car2.calculateCurrentMaxSpeed();
        car2.carInfo();

    }
}
