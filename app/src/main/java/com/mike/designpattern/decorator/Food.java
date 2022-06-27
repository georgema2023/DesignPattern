package com.mike.designpattern.decorator;

public abstract class Food implements Animal{
    Animal animal;
    public Food(Animal animal){
        this.animal = animal;
    }

    @Override
    public void eat() {
        animal.eat();
    }
}
