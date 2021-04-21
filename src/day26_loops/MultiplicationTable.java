package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 11;
        /**
         * if number less than 1 or more than 10
         * print ---> "ERROR: invalid input"
         * exit main method: return;
         */
// you put negative statement on top because the system will run it first and then the rest
        //if you put it on after "FOR" statement......than it will run the whole code give you
        // everything and than print ("ERROR: invalid input")
        if(number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return;
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    // this is what happens when you loop below.....

     //   System.out.println(number + " x " + 1 + " = " + (number*1));
     //   System.out.println(number + " x " + 2 + " = " + (number*2));
     //   System.out.println(number + " x " + 3 + " = " + (number*3));
     //   System.out.println(number + " x " + 4 + " = " + (number*4));
     //   System.out.println(number + " x " + 5 + " = " + (number*5));
     //   System.out.println(number + " x " + 6 + " = " + (number*6));
     //   System.out.println(number + " x " + 7 + " = " + (number*7));


        }

    }
