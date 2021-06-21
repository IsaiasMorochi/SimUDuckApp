package com.imorochi.simuduck;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
//        super.quack();
        System.out.println("This duck say Squeak");
    }

    @Override
    public void display() {
        System.out.println("It's Rubberduck");
    }
}
