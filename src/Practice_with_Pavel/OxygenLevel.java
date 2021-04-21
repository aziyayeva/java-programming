package Practice_with_Pavel;

import java.util.Scanner;

/*
[Oxygen level - If statements, operators]

You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
x
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%

 */

public class OxygenLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value");
        int tankLevel = scan.nextInt();
        if (tankLevel > 90) {
            System.out.println("Your tank is full");

        }

        if (tankLevel > 80) {
            System.out.println("Still okay");

        }
        if (tankLevel > 70) {
            System.out.println("Don't go too far");

        }

        if (tankLevel > 60) {
            System.out.println("Start to head back");

        }

        if (tankLevel > 50) {
            System.out.println("Be careful now you are at " + tankLevel + "%");

        }



}}


