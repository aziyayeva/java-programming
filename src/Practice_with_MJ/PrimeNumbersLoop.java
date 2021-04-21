package Practice_with_MJ;
import java.util.*;

public class PrimeNumbersLoop {  /// 04/07/2021
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //   int number = 17;
        //  int countDivisibility = 0;
        //  String primeNumber = "";
        //   for(int i = 2; i < 17; i++) {
        //       if(number % i == 0);
        //           countDivisibility++;

        int countDivisibility = 0;
        String primeNumber = "";
        for (int i = 2; i <= number; i++) {
            countDivisibility++;
            for(int j=2; j < i; j++) {

                if( i % j == 00) {
                    countDivisibility++;
                }
            }
            if (countDivisibility == 0) {
                primeNumber+= i + ", ";
            }
            }


        System.out.println(primeNumber);
        System.out.println();
        System.out.println(countDivisibility);
    }
}