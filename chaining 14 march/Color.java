// 4. Color class
class Color {
    String shade;
    boolean isWaterproof;
    double price;
    String brand;
    int quantity;
    String type;

    Color() {}
    Color(String shade) { 
	this.shade = shade; }
    Color(String shade, boolean isWaterproof) { 
	this.shade = shade; this.isWaterproof = isWaterproof; }
    Color(String shade, boolean isWaterproof, double price) { 
        this.shade = shade; this.isWaterproof = isWaterproof; this.price = price;
    }
    Color(String shade, boolean isWaterproof, double price, String brand) { 
        this.shade = shade; this.isWaterproof = isWaterproof; this.price = price; this.brand = brand;
    }
    Color(String shade, boolean isWaterproof, double price, String brand, int quantity) { 
        this.shade = shade; this.isWaterproof = isWaterproof; this.price = price; this.brand = brand;
        this.quantity = quantity;
    }
    Color(String shade, boolean isWaterproof, double price, String brand, int quantity, String type) {
        this.shade = shade;
        this.isWaterproof = isWaterproof;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.type = type;
    }

    void display() {
        System.out.println("Color [Shade=" + shade + ", Waterproof=" + isWaterproof + 
            ", Price=" + price + ", Brand=" + brand + ", Quantity=" + quantity + ", Type=" + type + "]");
    }
}