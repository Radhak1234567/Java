package com.example.myapp;

public class Clip {
   Color color;

   public  Clip(Color color) {
        this.color = color;
    }

    void hold() {
        System.out.println("running clip");
    }
}   