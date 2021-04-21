package PRACTICE_ON_MY_OWN;

public class WhileLoopApples {
    public static void main(String[] args) {

        int apples = 0;
        while (apples <= 10 ) {
            apples++; // this expression makes sure the condition becomes true eventually
                      // if you do not add apples++ the loop will be infinite

            System.out.println("Eating an apple - " + apples);
        }

        System.out.println("no more apples");


    }
}
