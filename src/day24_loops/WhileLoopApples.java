package day24_loops;

public class WhileLoopApples {
    public static void main(String[] args) {

        int apples = 1;
        while(apples <= 10) {
            System.out.println("Eating an apple - " + apples);
            apples ++; // this expression makes sure the condition becomes true eventually
                       // if you do not add apples++ the loop will be infinite

        }
        System.out.println("Dont eat an apple");


    }
}
