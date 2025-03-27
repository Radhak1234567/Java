package com.xworkz.projectorr.utilities;

import com.xworkz.projectorr.components.Lamp;

import com.xworkz.projectorr.components.Warranty;
import com.xworkz.projectorr.components.Battery;
import com.xworkz.projectorr.components.Lens;
import com.xworkz.projectorr.components.Lamp;
import com.xworkz.projectorr.components.Wire;
import com.xworkz.projectorr.components.Board;
import com.xworkz.projectorr.components.Remote;
import com.xworkz.projectorr.components.Port;
public class ProjectorrRunner {
    public static void main(String[] args) {

    Warranty warranty = new Warranty("2024-01-01", "2026-01-01");
    Battery battery = new Battery("Duracell", 9);


    Lens lens = new Lens("Convex", 50);
    Lamp lamp = new Lamp("Philips", warranty);
    Wire wire = new Wire("Copper", "Premium");
    Board board = new Board("Intel", "Electrolytic");
    Remote remote = new Remote("Sony-X100", battery);
Port port=new Port("c type");

    System.out.println("Initial Values:");
    lens.display();
    lamp.display();
    wire.display();
    board.display();
    remote.display();

        System.out.println("======================================");
    System.out.println("After Modifications:");
    lens.setLensType("Concave");
    lens.setFocalLength(75);
    lamp.setBrand("Osram");
    wire.setMaterial("Aluminum");
    wire.setQuality("Standard");
    board.setManufacturer("radha");
    board.setCapacitor("Cera");
    remote.setModel("Samsung-200");
    battery.setBrand("samsung");
    battery.setVoltage(12);
        port.setPortType("b type");

        lens.display();
    lamp.display();
    wire.display();
    board.display();
    remote.display();
        port.display();
}
}

