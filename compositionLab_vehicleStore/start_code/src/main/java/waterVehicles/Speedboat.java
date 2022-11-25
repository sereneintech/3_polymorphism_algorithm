package waterVehicles;

import products.IProduct;
import vehicles.Engine;
import vehicles.IMotorised;

import vehicles.Vehicle;

public final class Speedboat extends Vehicle implements IMotorised,IWaterVehicle {
    private IMotorised baseProduct;

    private String hullType;
    public Speedboat(float weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct); //call constructor from Motor//
    }
    @Override
    public void startEngine() {
    this.baseProduct.startEngine();
    }
    @Override
    public void stopEngine() {
    this.baseProduct.stopEngine();
    }
    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void setFuel(int fuel) {

    }

    @Override
    public String getHullType() {
        return null;
    }

    @Override
    public void setHullType(String type) {

    }
}
