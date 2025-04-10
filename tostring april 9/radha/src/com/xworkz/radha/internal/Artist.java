package com.xworkz.radha.internal;

public class Artist {
  private   int age;
  private   String name;
   private double height;

    public Artist(int age, String name, double height) {
        this. age =age;
        this.name = name;
        this.height= height;
    }

    @Override
    public String toString() {
        return "Artist{" + "id=" + age + ", name='" + name + '\'' + ", height=" +height + '}';
    }
    @Override
    public int hashCode() {
        return 209;
    }

}
