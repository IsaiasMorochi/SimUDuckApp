package com.imorochi.simuduck;

public class RealDuck extends Duck implements Flyable{

    @Override
    public void display() {
        System.out.println("It's RealDuck.");
    }

    @Override
    public void fly() {
        System.out.println("It's flying.");
    }
}
