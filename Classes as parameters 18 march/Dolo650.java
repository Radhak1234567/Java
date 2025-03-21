class Dolo650 {
    void take(Medicine medicine) {
        if (medicine != null) {
            medicine.consume();
        } else {
            System.out.println("Medicine is not available");
        }
    }
}