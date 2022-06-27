package com.mike.designpattern.singleton;

public class Singleton3Java {
    private volatile static Singleton3Java instance;

    private Singleton3Java() {
    }

    private static Singleton3Java getInstance() {
        if (instance == null) {
            synchronized (Singleton3Java.class) {
                if (instance == null) {
                    instance = new Singleton3Java();
                }
            }
        }
        return instance;
    }

}
