package com.xworkx.IV;

public class Satellite {
    private SatelliteType type;
    private double cost;
    private double weight;
    private double loadCapacity;

    public Satellite(SatelliteType type, double cost, double weight, double loadCapacity) {
        this.type = type;
        this.cost = cost;
        this.weight = weight;
        this.loadCapacity = loadCapacity;
    }


    public SatelliteType getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }


    public void setType(SatelliteType type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}
