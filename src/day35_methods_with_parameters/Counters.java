package day35_methods_with_parameters;

public class Counters {
    public static void main(String[] args) {
        countUntil(2);
        int number = 5;
        countUntil(number);
        int number1 = 3;
        countUntil(number1);

        String word = "wooden spoon";
        countUntil(word.length());
        String str = "Anna loves JAVA";
        countUntil(str.length());

        printAge(1988);
        int birthYear = 2001;
        printAge(birthYear);



    }

    public static void countUntil(int number) {
        System.out.println("");
        for(int i = 0; i <= number; i++){
            System.out.print(i + "  ");
        }
        System.out.println("");
    }

    public static void printAge(int year) {
        System.out.println();
        int age = 2021-year;
        System.out.println("Birth year: " + year + ". Age: " + age);
        System.out.println();

    }

}
