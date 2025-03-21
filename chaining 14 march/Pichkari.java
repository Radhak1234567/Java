// 3. Pichkari class
class Pichkari {
    String brand;
    int length;
    String color;
    double price;
    boolean isPlastic;
    int waterCapacity;

    Pichkari() {}
    Pichkari(String brand) { this.brand = brand; }
    Pichkari(String brand, int length) { this.brand = brand; this.length = length; }
    Pichkari(String brand, int length, String color) { this.brand = brand; this.length = length; this.color = color; }
    Pichkari(String brand, int length, String color, double price) { 
        this.brand = brand; this.length = length; this.color = color; this.price = price; 
    }
    Pichkari(String brand, int length, String color, double price, boolean isPlastic) { 
        this.brand = brand; this.length = length; this.color = color; this.price = price;
        this.isPlastic = isPlastic;
    }
    Pichkari(String brand, int length, String color, double price, boolean isPlastic, int waterCapacity) {
        this.brand = brand;
        this.length = length;
        this.color = color;
        this.price = price;
        this.isPlastic = isPlastic;
        this.waterCapacity = waterCapacity;
    }

    void display() {
        System.out.println("Pichkari [Brand=" + brand + ", Length=" + length + "cm, Color=" + color +
            ", Price=" + price + ", Plastic=" + isPlastic + ", Capacity=" + waterCapacity + "ml]");
    }
}
