package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startCheapCar();
        shiftToDrive();
        pressGasPedal();

    }
    public static void seatInCar(){
        System.out.println("1. Open the door and please seat in driver seat");

    }

    public static void startCheapCar() {
        System.out.println("2. Insert key to ignition and turn clockwise");
    }

    public static void shiftToDrive() {
        System.out.println("3. Press break pedal and shift to gear D");
    }

    public static void pressGasPedal() {
        System.out.println("4. Press gas pedal and take off as far as possible");

    }

    }
