// 7. Tomato
class Tomato {
    String type;
    double weight;
    String color;
    boolean isOrganic;
    float price;
    int size;

    Tomato() {}
    Tomato(String type) { this.type = type; }
    Tomato(String type, double weight) { this.type = type; this.weight = weight; }
    Tomato(String type, double weight, String color) {
        this.type = type; this.weight = weight; this.color = color;
    }
    Tomato(String type, double weight, String color, boolean isOrganic) {
        this.type = type; this.weight = weight; this.color = color; this.isOrganic = isOrganic;
    }
    Tomato(String type, double weight, String color, boolean isOrganic, float price) {
        this.type = type; this.weight = weight; this.color = color;
        this.isOrganic = isOrganic; this.price = price;
    }
    Tomato(String type, double weight, String color, boolean isOrganic, float price, int size) {
        this.type = type; this.weight = weight; this.color = color;
        this.isOrganic = isOrganic; this.price = price; this.size = size;
    }

    void display() {
        System.out.println("Tomato [Type=" + type + ", Weight=" + weight + ", Color=" + color +
                ", Organic=" + isOrganic + ", Price=" + price + ", Size=" + size + "]");
    }
}