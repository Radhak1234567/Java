class Rocket {
    void launch(Engine engine) {
        if (engine != null) {
            engine.start();
        } else {
            System.out.println("Engine is not installed");
        }
    }
}