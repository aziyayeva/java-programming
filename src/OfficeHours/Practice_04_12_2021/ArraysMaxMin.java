package OfficeHours.Practice_04_12_2021;

public class ArraysMaxMin {
    public static void main(String[] args) {

        int [] numbers = {12, 55, 65, 85, 3, 1};
        int min = numbers[0];
        int max = numbers[0];
        // each --> represents every element (number) | for loop: numbers[i]
        for( int each : numbers) {

            if(each < min) {
                min = each;
            }
            if(each > max) {
                max = each;
            }

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


    }
}
