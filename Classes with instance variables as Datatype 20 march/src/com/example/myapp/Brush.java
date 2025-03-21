package com.example.myapp;

public class Brush {
    BrushColor color;

    Brush(BrushColor color) {
        this.color = color;
    }

    void clean() {
        System.out.println("Cleaning");
    }

    void scrub() {
        System.out.println("Scrub");
    }
}
