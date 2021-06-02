package day49_static;

import com.sun.tools.javac.code.Attribute;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message = " + message);
        System.out.println("count = " + count);
      //  System.out.println("num = " + num); //ERROR: num is instance variable. sttaic cannot accept
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //StaticMethods.instanceMethod(); > no
    //StaticMethods stm = new StaticMethods ();
    //
    public void instanceMethod() {
        System.out.println("instanceMethod");
    }

}
