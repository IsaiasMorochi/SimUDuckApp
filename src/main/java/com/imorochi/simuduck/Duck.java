package com.imorochi.simuduck;

public abstract class Duck {

    public void quack() {
        System.out.println("Duck's say quack.");
    }

    public void swim() {
        System.out.println("Duck's swimming.");
    }

    public abstract void display();

    public void fly() {
        System.out.println("Duck's flying.");
    }

    // OTHER duck-like methods.
}
