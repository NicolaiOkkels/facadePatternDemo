package app;

public class Main {

    public static void main(String[] args) {
        VehicleFacade vehicleFacade = new VehicleFacade();

        vehicleFacade.startCarEngine();
        vehicleFacade.stopCarEngine();
        vehicleFacade.startMotorcycleEngine();
        vehicleFacade.stopMotorcycleEngine();
        vehicleFacade.startTankEngine();
        vehicleFacade.fireTankCannon();
    }
}
