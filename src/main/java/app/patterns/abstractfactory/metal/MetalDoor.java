package app.patterns.abstractfactory.metal;

import app.patterns.abstractfactory.Door;

public class MetalDoor extends Door {
    @Override
    public void close() {
        System.out.println("Closing metal door...");
    }

    @Override
    public void lock() {
        System.out.println("Locking metal door...");
    }

    @Override
    public void open() {
        System.out.println("Opening metal door...");
    }
}