package Practice_with_Anton_04_01_2021_Loops;

import java.util.Scanner;

/**
 * • Write a program that can print all the ODD numbers between 0 ~ 100
 * that can be divisible by 3 & 5
 * <p>
 * • Write a program that can print all the EVEN numbers between 0 ~
 * 100 that can be divisible by 3 & 5
 */

public class DivisibleBy {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
//            if(!(i%2 == 0)) {
            if (i % 2 == 1) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("ODD and 3 & 5 (1):" + i);
                    }
                }
            }
        }

        for(int i = 0; i <= 100; i++) {
            if( (i % 5 == 0) && (i % 3 == 0) && (i % 2 == 1)) {
                System.out.println("ODD and 3 & 5 (2):" + i);
            }
        }

    }

}
