class Camera {
    void attach(Lens lens) {
        if (lens != null) {
            lens.focus();
        } else {
            System.out.println("Lens is missing");
        }
    }
}