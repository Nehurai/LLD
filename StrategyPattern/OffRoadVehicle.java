package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(DriveStrategy driveObject) {
        super(new SportsDriveStrategy());
    }   
    
}
