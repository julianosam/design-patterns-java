package app.patterns.abstractfactory.metal;

import app.patterns.abstractfactory.Window;

public class MetalWindow extends Window {
    @Override
    public void close() {
        System.out.println("Closing metal window...");
    }

    @Override
    public void lock() {
        System.out.println("Locking metal window...");
    }

    @Override
    public void open() {
        System.out.println("Opening metal window...");
    }
}