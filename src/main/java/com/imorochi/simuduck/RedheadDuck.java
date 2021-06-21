package com.imorochi.simuduck;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("It's ReadheadDuck.");
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
