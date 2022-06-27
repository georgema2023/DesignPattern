package com.mike.designpattern.singleton;

public class Singleton4Java {
    private static class SingletonProvider{
        private static Singleton4Java instance = new Singleton4Java();
    }

    private Singleton4Java(){}
    public static Singleton4Java getInstance(){
        return SingletonProvider.instance;
    }
}
