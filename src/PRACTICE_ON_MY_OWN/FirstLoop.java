package PRACTICE_ON_MY_OWN;

public class FirstLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) { //while loops is checking the condition while it is true, once the condition becomes
            i++;     // false then the loop exits
            System.out.println(i);


        }

        int apples = 1;
        while (apples <= 3) {
            System.out.println("apples -> " + apples);
            apples ++;

        }
        System.out.println("apples = " + apples);

    }      // returns ==> apples -> 1
            //            apples -> 2
    //                    apples -> 3
    //                    apples = 4 == total apples
}


//           return:  2
//                    3
//                    4
//                    5
//                    6

