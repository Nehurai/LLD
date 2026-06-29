package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicles extends Vehicle {
    GoodsVehicles() {
        super(new NormalDriveStrategy());
    }
}
