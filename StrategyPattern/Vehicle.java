package StrategyPattern;
import StrategyPattern.Strategy.DriveStrategy;
public class Vehicle {
    DriveStrategy driveObject ;

    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    public void drive() {
        driveObject.drive();
    }
}
