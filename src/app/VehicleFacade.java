package app;

public class VehicleFacade {
    private Car car;
    private Tank tank;
    private Motorcycle motorcycle;

    public VehicleFacade() {
        this.car = new Car();
        this.tank = new Tank();
        this.motorcycle = new Motorcycle();
    }

    public void fireTankCannon(){
        tank.fireCannon();
    }

    public void startCarEngine(){
        car.startEngine();
    }

    public void startTankEngine(){
        tank.startEngine();
    }

    public void startMotorcycleEngine(){
        motorcycle.startEngine();
    }

    public void stopCarEngine(){
        car.stopEngine();
    }

    public void stopTankEngine(){
        tank.stopEngine();
    }

    public void stopMotorcycleEngine(){
        motorcycle.stopEngine();
    }
}
