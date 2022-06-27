package com.mike.designpattern.builder;

public class Test {
    public static void main(String[] args) {
        PenJava penJava = new PenJava.Builder().color("yellow").width(2f).round(true).build();
        penJava.write();
    }
}
