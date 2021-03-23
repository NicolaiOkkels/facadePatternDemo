package app;

public class Tank implements Vehicle{

    public void fireCannon(){
        System.out.println("Fire!!!");
    }

    @Override
    public void startEngine() {
        System.out.println("Start tank engine..");
    }

    @Override
    public void stopEngine() {
        System.out.println("tank engine is stopped");
    }
}
