package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);

        // 6 cars left the parking lot
        //cars = cars - 6;
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        cars = cars- 1;
        cars -= 1;
        System.out.println("cars in the parking lot= " + cars);

        int electricCars = 13;
        electricCars += electricCars;
        System.out.println("electricCars came into parking lot = " + electricCars);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add letter 'J'

        letter += 1;
        System.out.println("letter = " + letter);







    }
}
