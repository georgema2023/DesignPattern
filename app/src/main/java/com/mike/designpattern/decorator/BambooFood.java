package com.mike.designpattern.decorator;

public class BambooFood extends Food {
    public BambooFood(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Bamboo");
    }
}
