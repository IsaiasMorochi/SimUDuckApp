package com.imorochi.simuduck;

public class DecoyDuck extends Duck {

    @Override
    public void quack() {
        // Overide to do nothing
    }

    @Override
    public void display() {
        System.out.println("It's DecoyDuck.");
    }

    @Override
    public void fly() {
        // Override to do nothing
    }
}
