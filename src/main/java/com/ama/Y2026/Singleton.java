package com.ama.Y2026;

public class Singleton {
    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
