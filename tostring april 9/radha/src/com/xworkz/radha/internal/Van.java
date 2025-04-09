package com.xworkz.radha.internal;

public class Van {
    int id;
    String name;
    double storageCapacity;

    public Van(int id, String name, double storageCapacity) {
        this.id = id;
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "Van{" + "id=" + id + ", name='" + name + '\'' + ", storageCapacity=" + storageCapacity + '}';
    }
}
