package com.xworkz.inheritence;

public class Runner1 {public static void main(String[] args) {
    Device device = new Device();
    device.method1();
    device.method2();
    device.method3();
    device.method4();
    device.method5();

    Device device1 = new Clock();
    device1.method1();
    device1.method2();
    device1.method3();
    device1.method4();
    device1.method5();

    Clock clock = new Clock();
    clock.method1();
    clock.method2();
    clock.method3();
    clock.method4();
    clock.method5();
}

}
