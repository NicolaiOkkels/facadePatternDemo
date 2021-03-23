package app;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Start car engine..");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopped");
    }
}
