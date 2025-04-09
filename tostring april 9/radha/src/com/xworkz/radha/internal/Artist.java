package com.xworkz.radha.internal;

public class Artist {
    int age;
    String name;
    double height;

    public Artist(int age, String name, double height) {
        this. age =age;
        this.name = name;
        this.height= height;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + age + ", name='" + name + '\'' + ", height=" +height + '}';
    }
}
