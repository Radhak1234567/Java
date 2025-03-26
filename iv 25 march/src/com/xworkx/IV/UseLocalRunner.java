package com.xworkx.IV;

public class UseLocalRunner {
    public static void main(String[] args) {
        UseLocal useLocal = new UseLocal();

        // Calling methods
        useLocal.createJail();
        useLocal.createSatellite();
        useLocal.createIdCard();
        useLocal.createAlien();
        useLocal.createCamera();

        // Using class as parameter
        Jail anotherJail = new Jail("Sing Sing", "New York", "Jane Doe", 400);
        useLocal.processJail(anotherJail);

        // Using array of objects
        useLocal.createArrayOfAliens();
    }
}
