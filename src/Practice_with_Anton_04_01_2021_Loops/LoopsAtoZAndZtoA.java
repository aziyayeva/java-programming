package Practice_with_Anton_04_01_2021_Loops;

/**
 * •Write a program that can calculate the sum of all the even numbers between 1 ~ 100•
 * <p>
 * Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */

public class LoopsAtoZAndZtoA {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
//                sum += i;
            }
        }
        System.out.println("SUM FOR 1:" + sum);

        sum = 0;
        for (int i = 2; i <= 100; i += 2) { // i += 2 ----> i = i + 2
            sum = sum + i;
        }
        System.out.println("SUM FOR 2:" + sum);

        sum = 0;
        for (int i = 2; i <= 100; ) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("SUM FOR3:" + sum);

        sum = 0;
        int k = 2;
        for (; k <= 100; ) {
            sum = sum + k;
            k += 2;
        }
        System.out.println("SUM FOR 4:" + sum);

        sum = 0;
        for (int i = 2; ; i += 2) {
            if (i > 100) {
                break;
            }
            sum = sum + i;
        }
        System.out.println("SUM FOR 5:" + sum);


        sum = 0;
        int n = 1;
        while (n <= 100) {
            if (n % 2 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println("SUM WHILE 1:" + sum);

        sum =0;
        int x = 2;
        while (x <= 100) {
            sum = sum + x;
            x = x + 2;
        }
        System.out.println("SUM WHILE 2:" + sum);


        sum = 0;
        int y = 2;
        do {
            sum = sum + y;
            y = y + 2;
        } while (y<=100);
        System.out.println("SUM DO 1:" + sum);


    }
}

class A {
}

class B {
}