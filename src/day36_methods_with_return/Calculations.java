package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+15 = " + Calculator.add(10,15));
        System.out.println("100 - 40 = " + Calculator.subtract(100,40));
        System.out.println("2 * 6 = " + Calculator.multiply(2,6));
        System.out.println("6 / 3 = " + Calculator.divide(6,3));

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
    }
    }
}
