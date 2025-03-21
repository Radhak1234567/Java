// 10. NailPolish
class NailPolish {
    String brand;
    String color;
    double price;
    int quantity;
    boolean isGel;
    String type;

    NailPolish() {}
    NailPolish(String brand) { this.brand = brand; }
    NailPolish(String brand, String color) { this.brand = brand; this.color = color; }
    NailPolish(String brand, String color, double price) {
        this.brand = brand; this.color = color; this.price = price;
    }
    NailPolish(String brand, String color, double price, int quantity) {
        this.brand = brand; this.color = color; this.price = price; this.quantity = quantity;
    }
    NailPolish(String brand, String color, double price, int quantity, boolean isGel) {
        this.brand = brand; this.color = color; this.price = price; this.quantity = quantity;
        this.isGel = isGel;
    }
    NailPolish(String brand, String color, double price, int quantity, boolean isGel, String type) {
        this.brand = brand; this.color = color; this.price = price; this.quantity = quantity;
        this.isGel = isGel; this.type = type;
    }

    void display() {
        System.out.println("NailPolish [Brand=" + brand + ", Color=" + color + ", Price=" + price +
                ", Quantity=" + quantity + ", Gel=" + isGel + ", Type=" + type + "]");
    }
}