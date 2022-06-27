package com.mike.designpattern.singleton;

public class Singleton2Java {
    private static Singleton2Java instance;

    private Singleton2Java() {
    }

    public static synchronized Singleton2Java getInstance() {
        if (instance == null) {
            instance = new Singleton2Java();
        }
        return instance;
    }
}
