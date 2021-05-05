package app;

public class Motorcycle implements Vehicle{

    boolean motercycleIsOn = false;

    @Override
    public void startEngine() {
        if(motercycleIsOn){
            System.out.println("Motorcycle engine is already on!!");
        } else{
            System.out.println("Start motorcycle engine..");
            motercycleIsOn = true;
        }
    }

    @Override
    public void stopEngine() {
        if(!motercycleIsOn){
            System.out.println("Motorcycle engine is not on!!");
        } else{
            System.out.println("Motorcycle engine is stopped");
            motercycleIsOn = false;
        }
    }
}
