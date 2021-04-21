package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum((int)2.2,3.8); // int casting from double
        MethodOverloading.sum("Anna", "Banana");
        MethodOverloading.sum(12.5,55.7);
        MethodOverloading.sum(3,5,7);
        sum(10,5.5);

    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int1, int2 sum)");
        System.out.println("Results = " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println(("sum(int1, int2 sum, int num3)"));
        System.out.println("Results = " + (num1 + num2 + num3));
    }

    public static void sum (double num1, double num2 ) {
        System.out.println("sum(double, double)");
        System.out.println("Results = " + (num1 + num2));
    }

    public static void sum (String str1, String str2 ) {
        System.out.println("sum(string, string)");
        System.out.println("Result = " + (str1 + str2));
    }

}
