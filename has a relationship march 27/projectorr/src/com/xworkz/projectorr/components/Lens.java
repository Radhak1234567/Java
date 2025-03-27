package com.xworkz.projectorr.components;

public class Lens {
    private String lensType;
    private int focalLength;

    public Lens(String lensType, int focalLength) {
        this.lensType = lensType;
        this.focalLength = focalLength;
    }

    public String getLensType() {
        return lensType;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    public void display() {
        System.out.println("Lens Type: " + lensType + ", Focal Length: " + focalLength);
    }

}
