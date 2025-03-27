package com.xworkz.projectorr.components;

public class Port {
    private String portType; // Private variable


    public Port(String portType) {
        this.portType = portType;
    }


    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public void display() {
        System.out.println("Port Type: " + portType);
    }
}
