// 6. Bucket
class Bucket {
    String material;
    int capacity;
    String color;
    double price;
    boolean hasLid;
    float weight;

    Bucket() {}
    Bucket(String material) { this.material = material; }
    Bucket(String material, int capacity) { this.material = material; this.capacity = capacity; }
    Bucket(String material, int capacity, String color) {
        this.material = material; this.capacity = capacity; this.color = color;
    }
    Bucket(String material, int capacity, String color, double price) {
        this.material = material; this.capacity = capacity; this.color = color; this.price = price;
    }
    Bucket(String material, int capacity, String color, double price, boolean hasLid) {
        this.material = material; this.capacity = capacity; this.color = color;
        this.price = price; this.hasLid = hasLid;
    }
    Bucket(String material, int capacity, String color, double price, boolean hasLid, float weight) {
        this.material = material; this.capacity = capacity; this.color = color;
        this.price = price; this.hasLid = hasLid; this.weight = weight;
    }

    void display() {
        System.out.println("Bucket [Material=" + material + ", Capacity=" + capacity + ", Color=" + color +
                ", Price=" + price + ", HasLid=" + hasLid + ", Weight=" + weight + "]");
    }
}
