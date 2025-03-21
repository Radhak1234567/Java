class Water {
    String source;
    double pHLevel;
    boolean isMineral;
    String color;
    double quantity;
    boolean isDrinkable;

    Water() {}
    Water(String source) { this.source = source; }
    Water(String source, double pHLevel) { this.source = source; this.pHLevel = pHLevel; }
    Water(String source, double pHLevel, boolean isMineral) {
        this.source = source;
        this.pHLevel = pHLevel;
        this.isMineral = isMineral;
    }
    Water(String source, double pHLevel, boolean isMineral, String color) {
        this.source = source;
        this.pHLevel = pHLevel;
        this.isMineral = isMineral;
        this.color = color;
    }
    Water(String source, double pHLevel, boolean isMineral, String color, double quantity) {
        this.source = source;
        this.pHLevel = pHLevel;
        this.isMineral = isMineral;
        this.color = color;
        this.quantity = quantity;
    }
    Water(String source, double pHLevel, boolean isMineral, String color, double quantity, boolean isDrinkable) {
        this.source = source;
        this.pHLevel = pHLevel;
        this.isMineral = isMineral;
        this.color = color;
        this.quantity = quantity;
        this.isDrinkable = isDrinkable;
    }

    void display() {
        System.out.println("Water [Source=" + source + ", pH Level=" + pHLevel + ", Mineral=" + isMineral +
                ", Color=" + color + ", Quantity=" + quantity + " liters, Drinkable=" + isDrinkable + "]");
    }
}
