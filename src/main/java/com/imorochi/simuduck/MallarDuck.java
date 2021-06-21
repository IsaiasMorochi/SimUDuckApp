package com.imorochi.simuduck;

public class MallarDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("It's MallarDuck.");
    }

    @Override
    public void fly() {
        System.out.println("It's flying.");
    }

    @Override
    public void quack() {
        System.out.println("It's say quack.");
    }
}
