package com.xworkz.radha.internal;

public class Van {
 private    int id;
   private String name;
  private   double storageCapacity;

    public Van(int id, String name, double storageCapacity) {
        this.id = id;
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "Van{" + "id=" + id + ", name='" + name + '\'' + ", storageCapacity=" + storageCapacity + '}';
    }
    @Override
    public int hashCode() {
        return 1;
    }
}
