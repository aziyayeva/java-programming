package Practice_with_MJ;

import java.util.*;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * print out true if all of the numbers in inner appear in outer.
 * Take advantage of the fact that both arrays are already in sorted order.
 */

public class InnerOuter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of inner array");
        int sizeInner = scan.nextInt();
        System.out.println("Enter the size of outer array");
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeOuter];
        int[] outer = new int[sizeInner];
        System.out.println("Enter the index of outer array");

        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        System.out.println("Enter the outer of outer array");
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        for (int i = 0; i < inner.length; i++) {
            if (Arrays.binarySearch(outer, inner[i]) < 0) {
                System.out.println(false);
                return;
            } else {
                System.out.println(true);
            }
        }

        }

    }



