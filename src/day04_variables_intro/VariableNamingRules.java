package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        //System.out.println("break"); - command will not print
       // int static = 22; --- error, static is RESERVED BY JAVA
        int static2 = 22;
        int _static = 22;
        int $tatic = 45;
        int staticVar = 23;

        int salary$ = 55;
       // int 1stMonthSalary = 55; --- ERROR, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println("salary $ = " + $); // these variable work....but not recommended
        System.out.println("weekly _ = " + _);// these variable work....but not recommended
       // int number-of-friends = 400;  --- cannot use dashes ----> ERROR

        //int number_of_friends = 500; ---- NOT CONVENTION
        int numberOfFriends = 500; // use this camel case









    }
}
