package app;

public class Car implements Vehicle {

    boolean carIsOn = false;

    @Override
    public void startEngine() {
        if(carIsOn){
            System.out.println("Car is already on!!");
        } else{
            System.out.println("Start car engine..");
            carIsOn = true;
        }
    }

    @Override
    public void stopEngine() {
        if(!carIsOn){
            System.out.println("Car engine is not on!!");
        } else{
            System.out.println("Car engine is stopped");
            carIsOn = false;
        }
    }
}
