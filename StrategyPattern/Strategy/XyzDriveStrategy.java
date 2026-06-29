package StrategyPattern.Strategy;

public class XyzDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Xyz driving capabilities.");
    }
}