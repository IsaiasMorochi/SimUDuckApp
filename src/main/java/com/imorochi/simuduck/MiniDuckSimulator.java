package com.imorochi.simuduck;

public class MiniDuckSimulator {

    private static final String SEPARATOR = "*********************";

    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println(SEPARATOR);

        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performQuack();
        mallarDuck.performFly();

        System.out.println(SEPARATOR);

        Duck realDuck = new RealDuck();
        realDuck.display();
        realDuck.swim();
        realDuck.performFly();

        System.out.println(SEPARATOR);

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();

        System.out.println(SEPARATOR);

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performQuack();
        decoyDuck.performFly();

        System.out.println(SEPARATOR);

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        decoyDuck.performFly();
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.performFly();
    }

}
