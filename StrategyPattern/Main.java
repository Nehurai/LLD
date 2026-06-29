package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle Vehicle = new SportsVehicle();
        Vehicle.drive();
        
        Vehicle goodsVehicle = new GoodsVehicles();
        goodsVehicle.drive();
        
        Vehicle offRoadVehicle = new OffRoadVehicle(null);
        offRoadVehicle.drive();
    }
}
