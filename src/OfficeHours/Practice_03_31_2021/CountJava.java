package OfficeHours.Practice_03_31_2021;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is fun. java class today, java, not javascript";
        int count = 0; // how many time we will find "java" in our String....

        while(str.contains("java")) {
            count++;
            str = str.replaceFirst("java", ""); //replaceFirst

        }
        System.out.println("Java was found " + count + " times");

    }
}
