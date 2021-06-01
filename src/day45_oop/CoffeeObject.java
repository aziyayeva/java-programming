package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("Amount after I drink 10 = " + myCoffee.getAmount());
        // NOT THIS WAY :  myCoffee.type = "Turkish Coffee"; INSTEAD USE A METHOD
        myCoffee.setType("Turkish Coffee");
        System.out.println("My Coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        //ADD ANOTHER COFFEE OBJECT, SET VALUES, CALL METHODS
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        //
        //
        Coffee coffee2 = coffee1;
        System.out.println("Coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");

        coffee3 = coffee2;
        System.out.println("coffee3 = " + coffee3.getType());

        Coffee coffee4 = null;


    }
}
