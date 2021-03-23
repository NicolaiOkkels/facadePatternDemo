package app;

public class Motorcycle implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Start motorcycle engine..");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine is stopped");
    }
}
