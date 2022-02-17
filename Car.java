package ObjectOrientedProg.Interfaces;

public class Car implements Brake, Engine, Media{

    @Override
    public void brake() {
        System.out.println("I Brake like a Normal Car");
    }

    @Override
    public void start() {
        System.out.println("I Start like a Normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I Stop like a Normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I Accelerate like a Normal Car");
    }
}
