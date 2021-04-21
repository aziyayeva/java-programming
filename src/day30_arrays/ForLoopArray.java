package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {

        int[] data = {11, 56, 25, 35, 125, 85, 65, 78, 98, 155};

        // variable data  :
        for (int eachNum : data) {
            System.out.print(eachNum + " ");
        }
        System.out.println("");
        System.out.println("--------FOR LOOP--------");
        int[] data2 = {32, 532, 12, 10, 123, 543, 654, 25, 65, 45};

        // last index at data2.length     i+=2 or 3 ---> every second or third will be printed.
        for (int i = 0; i < data2.length; i++) {  // use data2.length ---> until the last index....
            System.out.print(data2[i] + " * ");   // .length means last index....
                          //array name [index number]

        }
        System.out.println("");

        //print last value in array using length -1
                                 //data length -->10
        System.out.println("Last Value: " + data2[data2.length - 1]);

        //print all number backwards in the same line
        for(int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data2[idx] + " ");

        }

    }
}
