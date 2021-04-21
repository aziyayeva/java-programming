package day25_loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS");

       for(int n = 1; n <= 100; n++) {
           if( n % 2 == 0 ) {
               System.out.print(n + " * ");
           }

            }
        System.out.println("\nODD NUMBERS 0 -100: ");
       for(int k=0; k<=100; k++) {
           if(k % 2 != 0) {
               System.out.print(k + " * ");
       }


        }

    }

}
