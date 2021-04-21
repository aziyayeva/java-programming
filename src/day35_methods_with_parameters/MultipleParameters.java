package day35_methods_with_parameters;
import java.util.*;

public class MultipleParameters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();



        showSum(65.5, 85.5);
        showSum(d1,d2);

    }

    public static void showSum (double num1, double num2) {
        System.out.println("-----------------------");
      //  double sum = num1 + num2;
      //  System.out.println("Sum is: " + sum);
        System.out.println("Sum is: "+(num1+num2));
        System.out.println("-----------------------");
    }
}
