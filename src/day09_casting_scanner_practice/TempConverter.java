package day09_casting_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;


public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("^^^^^^ Converting from Fahrenheit to Celsius ^^^^^^ ");
        System.out.println("Enter Fahrenheit - :");
        double Fahrenheit = scan.nextDouble();
        double Celsius = (Fahrenheit - 32) *5/9;
        System.out.println("Temperature in C is: " + Celsius);





    }
}
