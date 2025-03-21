class Space {
    void explore(Planet planet) {
        if (planet != null) {
            planet.rotate();
        } else {
            System.out.println("Planet is not found");
        }
    }
}