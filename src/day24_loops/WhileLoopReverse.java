package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while(count >=0) { // if you do <=   --> nothing will print because the condition is false.....
            System.out.println("counter = " + count);
            count--; // decreasing by one until it reaches the tru boolean condition
                     // if you put count++   ===> infinite loop
        }
        System.out.println("Finished the count");


        int unreadSMS = 10;
        System.out.println("I have total " + unreadSMS +" unread message");
        while(unreadSMS > 0 ) { // or while(unreadSMS >= 1)
            System.out.println("reading SMS: " + unreadSMS);
            unreadSMS--;

        }

        System.out.println("Read all text messages");


    }
}
