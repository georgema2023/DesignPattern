package com.mike.designpattern.decorator;

public class CarrotFood extends Food {

    public CarrotFood(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Carrot");
    }
}
