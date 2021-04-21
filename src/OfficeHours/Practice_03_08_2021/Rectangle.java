package OfficeHours.Practice_03_08_2021;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        //hard coded values --> NO SCANNER INVOLVED...
        //double length = 5;
       // double width = 3;

        //DYNAMIC WITH SCANNER
        Scanner scan = new Scanner(System.in);

        double length = scan.nextDouble();
        System.out.println("Enter your length");
        double width = scan.nextDouble();
        System.out.println("Enter you width");


        double perimeter = 2 * (length + width);
        System.out.println("perimeter = " + perimeter);

        double area = length * width;
        System.out.println("area = " + area);

    }
}
