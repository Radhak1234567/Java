package com.xworkz.projectorr.components;

public class Port {
    private String portType; // Private variable

    // Constructor
    public Port(String portType) {
        this.portType = portType;
    }

    // Getter Method
    public String getPortType() {
        return portType;
    }

    // ✅ Setter Method (Important!)
    public void setPortType(String portType) {
        this.portType = portType;
    }

    // Display Method
    public void display() {
        System.out.println("Port Type: " + portType);
    }
}
