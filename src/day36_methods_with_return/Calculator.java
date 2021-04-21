package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println ("The sum is = " + add(25.5,25.5)); // ADDITION
        double result = add(7,3);
        System.out.println(result);
        System.out.println("100.5 + 85.5 = " + add(100.5,85.5));


        System.out.println("The result is = " + subtract(55.5,30.0));  // SUBTRACTION
        System.out.println("25 - 5 = " + subtract(25,5));

        System.out.println("The multiplication is " + multiply(3,2.5)); // MULTIPLICATION
        System.out.println("5 * 5 = " + multiply(5,5));

        System.out.println("The division is = " + divide(6,2)); // DIVISION
        System.out.println("10 / 2 = " + divide(10,2));

    }
    public static double add (double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double subtract (double num1, double num2) {
        double results = num1 - num2;
        return results;

    }
    public static double multiply (double num1, double num2) {
        double multiplication = num1 * num2;
        return multiplication;

    }
    public static double divide (double num1, double num2) {
        double division = num1/num2;
        return division;

    }

}
