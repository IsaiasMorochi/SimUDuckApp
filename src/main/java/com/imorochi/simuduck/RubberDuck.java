package com.imorochi.simuduck;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("It's Rubberduck");
    }

    @Override
    public void quack() {
        System.out.println("It's say quack.");
    }
}
