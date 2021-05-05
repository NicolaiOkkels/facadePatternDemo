package app;

import java.util.Scanner;

public class Tank implements Vehicle {

    boolean tankIsOn = false;

    public void fireCannon() {
        if(tankIsOn){
            int[] aim = takeAim();
            if (!(aim == null)) {
                System.out.println("Fire!!!");
                reloadCannon();
            }
        } else{
            System.out.println("Please start tank engine to do this command!");
        }
    }

    public int[] takeAim() {
        Scanner scan = new Scanner(System.in);
        int[] xy = new int[2];
        System.out.println("Enter aim coordinates..");
        System.out.println("Choose x coordinate: ");
        int x = scan.nextInt();
        System.out.println("Choose y coordinate: ");
        int y = scan.nextInt();

        xy[0] = x;
        xy[1] = y;

        System.out.println("Confirming current aim..");
        System.out.println("x: " + x + ", y: " + y);
        System.out.println("Type: Yes or no");
        String check = scan.next();

        boolean checkInput = false;
        while (!checkInput) {
            if (check.equals("Yes")) {
                System.out.println("Taking aim!!");
                checkInput = true;
            } else if (check.equals("No")) {
                System.out.println("ABORTING COMMAND");
                checkInput = true;
                xy = null;
            } else {
                System.out.println("ERROR!!!, shutting down");
                xy = null;
                break;
            }
        }

        return xy;
    }


    public void reloadCannon() {
        System.out.println("RELOADING...");
    }

    @Override
    public void startEngine() {
        if (tankIsOn) {
            System.out.println("Tank engine is already on!!");
        } else {
            System.out.println("Start tank engine..");
            tankIsOn = true;
        }
    }

    @Override
    public void stopEngine() {
        if (!tankIsOn) {
            System.out.println("Tank engine is not on!!");
        } else {
            System.out.println("Tank engine is stopped");
            tankIsOn = false;
        }
    }
}
