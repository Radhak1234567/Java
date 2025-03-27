package com.xworkz.projectorr.utilities;

import com.xworkz.projectorr.components.Lamp;

import com.xworkz.projectorr.components.Warranty;
import com.xworkz.projectorr.components.Battery;
import com.xworkz.projectorr.components.Lens;
import com.xworkz.projectorr.components.Lamp;
import com.xworkz.projectorr.components.Wire;
import com.xworkz.projectorr.components.Board;
import com.xworkz.projectorr.components.Remote;

public class ProjectorrRunner {
    public static void main(String[] args) {

    Warranty warranty = new Warranty("2024-01-01", "2026-01-01");
    Battery battery = new Battery("Duracell", 9);


    Lens lens = new Lens("Convex", 50);
    Lamp lamp = new Lamp("Philips", warranty);
    Wire wire = new Wire("Copper", "Premium");
    Board board = new Board("Intel", "Electrolytic");
    Remote remote = new Remote("Sony-X100", battery);


    System.out.println("Initial Values:");
    lens.display();
    lamp.display();
    wire.display();
    board.display();
    remote.display();


    System.out.println("\nAfter Modifications:");
    lens.setLensType("Concave");
    lens.setFocalLength(75);
    lamp.setBrand("Osram");
    wire.setMaterial("Aluminum");
    wire.setQuality("Standard");
    board.setManufacturer("AMD");
    board.setCapacitor("Ceramic");
    remote.setModel("Samsung-Z200");
    battery.setBrand("Energizer");
    battery.setVoltage(12);


    
    lens.display();
    lamp.display();
    wire.display();
    board.display();
    remote.display();
}
}

