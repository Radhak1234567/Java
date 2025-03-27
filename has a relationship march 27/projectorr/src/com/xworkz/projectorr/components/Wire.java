package com.xworkz.projectorr.components;

public class Wire {
    private String material;
    private String quality;

    public Wire(String material, String quality) {
        this.material = material;
        this.quality = quality;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void display() {
        System.out.println("Wire Material: " + material + ", Quality: " + quality);
    }
}
