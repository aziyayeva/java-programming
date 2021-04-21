package OfficeHours.Practice_03_31_2021;

public class CountJava2 {

    /**
     *
     * Print the number of times that the string "java" appears anywhere in the given string word
     */

    public static void main(String[] args) {

        String str = "java is fun. java class today, java, not javascript";
        int count = 0; // how many time we will find "java" in our String....

        //str.substring(0,4) ---> count every 4 characters....for the word JAVA
        //str.substring(1,5)
        //str.substring(2,6)

        for (int i = 0; i < str.length()-3; i++) {

            String eachFourLetters = str.substring(i, i+4);
            System.out.println(eachFourLetters);
            if(eachFourLetters.equals("java")) {
                count++;

            }

        }
        System.out.println(count);


    }


}
