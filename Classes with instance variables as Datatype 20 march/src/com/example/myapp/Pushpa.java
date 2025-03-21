package com.example.myapp;

public class Pushpa {
    Clip[] clips;

    // ✅ Constructor accepting Clip[] array
    public Pushpa(Clip[] clips) {
        this.clips = clips;
    }

    void useClip(Clip[] clips) {
        if (clips != null) {
            System.out.println("Pushpa is running");
            for (Clip clip : clips) {
                if (clip != null) {
                    clip.hold();
                }
            }
        } else {
            System.out.println("Null");
        }
    }
}
