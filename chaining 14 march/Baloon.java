// 1. Baloon class
class Baloon {
    String color;
    int size;
    String material;
    boolean isInflated;
    double weight;
    float price;

    // 7 Constructors
    Baloon() {}
    Baloon(String color) { this.color = color; }
    Baloon(String color, int size) { this.color = color; this.size = size; }
    Baloon(String color, int size, String material) { this.color = color; this.size = size; this.material = material; }
    Baloon(String color, int size, String material, boolean isInflated) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isInflated = isInflated;
    }
    Baloon(String color, int size, String material, boolean isInflated, double weight) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isInflated = isInflated;
        this.weight = weight;
    }
    Baloon(String color, int size, String material, boolean isInflated, double weight, float price) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isInflated = isInflated;
        this.weight = weight;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Baloon [Color" + color + ", Size" + size + ", Material" + material + 
            ", Inflated" + isInflated + ", Weight" + weight + ", Price" + price + "]");
    }
}
