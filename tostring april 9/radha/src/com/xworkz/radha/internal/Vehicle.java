package com.xworkz.radha.internal;

public class Vehicle {

      private   int id;
       private String name;
        private double loadCapacity;

        public Vehicle(int id, String name, double loadCapacity) {
            this.id = id;
            this.name = name;
            this.loadCapacity = loadCapacity;
        }

        @Override
        public String toString() {
            return " Vehicle{" + "id=" + id + ", name='" + name + '\'' + ", loadCapacity=" + loadCapacity + '}';
        }
    @Override
    public int hashCode() {
        return 23;
    }
    }

