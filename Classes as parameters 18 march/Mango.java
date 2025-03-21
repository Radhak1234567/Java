class Mango {
    void checkFruit(Fruit fruit) {
        if (fruit != null) {
            fruit.taste();
        } else {
            System.out.println("Fruit is not available");
        }
    }
}