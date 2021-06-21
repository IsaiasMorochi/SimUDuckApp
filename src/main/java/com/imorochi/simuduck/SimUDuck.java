package com.imorochi.simuduck;

public class SimUDuck {

    public static void main(String[] args) {

        Duck domesticDuck = new DomesticDuck();
        domesticDuck.display();
        domesticDuck.swim();
        domesticDuck.quack();
        domesticDuck.fly();

        System.out.println("*********************");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        rubberDuck.fly();
        System.out.println("*********************");

        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.quack();
        mallarDuck.fly();

        System.out.println("*********************");

        Duck realDuck = new RealDuck();
        realDuck.display();
        realDuck.swim();
        realDuck.quack();
        realDuck.fly();

        System.out.println("*********************");

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

    }

}
