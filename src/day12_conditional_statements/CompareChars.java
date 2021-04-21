package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        //letters check with ASCII CHART
        char letter1 = 'A';
        char letter2 = 'J';

        System.out.println(letter1 == letter2); // 65 == 74  check is equal
        System.out.println(letter1 > letter2); // 65 > 74 check is A > B
        System.out.println(letter2 > letter1); // 74 > 65 check if B > A
        System.out.println("");

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? -  = " + pass);



    }
}
