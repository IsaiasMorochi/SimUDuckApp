package com.imorochi.simuduck;

public class RealDuck extends Duck {

    public RealDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("It's RealDuck.");
    }

}
