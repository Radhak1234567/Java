// 5. Egg
class Egg {
    String type;
    double weight;
    String color;
    boolean isBoiled;
    int size;
    float price;

    Egg() {}
    Egg(String type) { this.type = type; }
    Egg(String type, double weight) { this.type = type; this.weight = weight; }
    Egg(String type, double weight, String color) { this.type = type; this.weight = weight; this.color = color; }
    Egg(String type, double weight, String color, boolean isBoiled) {
        this.type = type; this.weight = weight; this.color = color; this.isBoiled = isBoiled;
    }
    Egg(String type, double weight, String color, boolean isBoiled, int size) {
        this.type = type; this.weight = weight; this.color = color; this.isBoiled = isBoiled;
        this.size = size;
    }
    Egg(String type, double weight, String color, boolean isBoiled, int size, float price) {
        this.type = type; this.weight = weight; this.color = color; this.isBoiled = isBoiled;
        this.size = size; this.price = price;
    }

    void display() {
        System.out.println("Egg [Type=" + type + ", Weight=" + weight + ", Color=" + color +
                ", Boiled=" + isBoiled + ", Size=" + size + ", Price=" + price + "]");
    }
}
