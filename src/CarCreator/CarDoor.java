package CarCreator;

import java.util.Random;

public class CarDoor {

    private boolean doorStatus;
    private boolean windowStatus;

    public CarDoor() {
        this.doorStatus = true ;
        this.windowStatus = true;
    }

    public CarDoor(boolean doorStatus, boolean windowStatus) {
        this.doorStatus = doorStatus;
        this.windowStatus = windowStatus;
    }

    public void openDoor(){
        doorStatus=true;
    }

    public void closeDoor(){
        doorStatus=false;
    }

    public void changeDoorStatus(){
        if(doorStatus==false){
            doorStatus=true;
        }
        else {
        doorStatus = false;
        }
    }

    public void openWindow(){
        windowStatus=true;
    }

    public void closeWindow(){
        windowStatus=false;
    }

    public void changeWindowStatus(){
        if(windowStatus==true){
            windowStatus=false;
        }
        else {
            windowStatus=true;
        }
    }

    public void doorInfo(){
        System.out.println("Door status is : " + doorStatus);
        System.out.println("Window status is : " + windowStatus);
    }


}