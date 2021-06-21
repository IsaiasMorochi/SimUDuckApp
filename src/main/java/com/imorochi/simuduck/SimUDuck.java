package com.imorochi.simuduck;

public class SimUDuck {

    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println("*********************");

        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performQuack();
        mallarDuck.performFly();

        System.out.println("*********************");

        Duck realDuck = new RealDuck();
        realDuck.display();
        realDuck.swim();
        realDuck.performFly();

        System.out.println("*********************");

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();

        System.out.println("*********************");

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performQuack();
        decoyDuck.performFly();

    }

}
