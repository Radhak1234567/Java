class RCB {
    void startMatch(Player player) {
        if (player != null) {
            player.play();
        } else {
            System.out.println("Player is not available");
        }
    }
}