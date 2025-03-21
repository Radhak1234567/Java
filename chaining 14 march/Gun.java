// 9. Gun
class Gun {
    String model;
    String type;
    double weight;
    int capacity;
    String material;
    boolean isLoaded;

    Gun() {}
    Gun(String model) { this.model = model; }
    Gun(String model, String type) { this.model = model; this.type = type; }
    Gun(String model, String type, double weight) {
        this.model = model; this.type = type; this.weight = weight;
    }
    Gun(String model, String type, double weight, int capacity) {
        this.model = model; this.type = type; this.weight = weight;
        this.capacity = capacity;
    }
    Gun(String model, String type, double weight, int capacity, String material) {
        this.model = model; this.type = type; this.weight = weight;
        this.capacity = capacity; this.material = material;
    }
    Gun(String model, String type, double weight, int capacity, String material, boolean isLoaded) {
        this.model = model; this.type = type; this.weight = weight;
        this.capacity = capacity; this.material = material; this.isLoaded = isLoaded;
    }

    void display() {
        System.out.println("Gun [Model=" + model + ", Type=" + type + ", Weight=" + weight +
                ", Capacity=" + capacity + ", Material=" + material + ", Loaded=" + isLoaded + "]");
    }
}
