package PRACTICE_ON_MY_OWN;

public class WhileLoopReverse {
    public static void main(String[] args) {

        int count = 5;
        while (count >= 0) {  //MAKE THIS CONDITION FALSE, IN ORDER FOR THE LOOP TO RUN
                              // IT'S ABOUT BOOLEAN CONDITION
            System.out.println("keep counting - " + count);
            count--; // decrement / reverse counting
        }

        System.out.println("Finished the count");

    }
}
