// 8. WaterBall
class WaterBall {
    String color;
    double diameter;
    boolean isFilled;
    float weight;
    int capacity;
    String material;

    WaterBall() {}
    WaterBall(String color) { this.color = color; }
    WaterBall(String color, double diameter) { this.color = color; this.diameter = diameter; }
    WaterBall(String color, double diameter, boolean isFilled) {
        this.color = color; this.diameter = diameter; this.isFilled = isFilled;
    }
    WaterBall(String color, double diameter, boolean isFilled, float weight) {
        this.color = color; this.diameter = diameter; this.isFilled = isFilled;
        this.weight = weight;
    }
    WaterBall(String color, double diameter, boolean isFilled, float weight, int capacity) {
        this.color = color; this.diameter = diameter; this.isFilled = isFilled;
        this.weight = weight; this.capacity = capacity;
    }
    WaterBall(String color, double diameter, boolean isFilled, float weight, int capacity, String material) {
        this.color = color; this.diameter = diameter; this.isFilled = isFilled;
        this.weight = weight; this.capacity = capacity; this.material = material;
    }

    void display() {
        System.out.println("WaterBall [Color=" + color + ", Diameter=" + diameter + ", Filled=" + isFilled +
                ", Weight=" + weight + ", Capacity=" + capacity + ", Material=" + material + "]");
    }
}