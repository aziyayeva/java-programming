package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        System.out.println(Arrays.toString(args));

        main(2);
        main(false);
        main(5.5);

    }
    public static void main(int num) {
        System.out.println("Hello from Overloading main Method ==> int *** " + num
        );
    }
    public static void main(double num1) {
        System.out.println("Hello from Overloading main Method ==> double *** " + num1);
    }
    public static void main(boolean t) { System.out.println("Hello from Overloading main Method ==> boolean *** " + t);

    }
}