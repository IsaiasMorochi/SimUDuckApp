package com.imorochi.simuduck;

public class SimUDuck {

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        System.out.println("*********************");

        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.quack();
        mallarDuck.fly();

        System.out.println("*********************");

        RealDuck realDuck = new RealDuck();
        realDuck.display();
        realDuck.swim();
        realDuck.fly();

        System.out.println("*********************");

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("*********************");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();

    }

}
