package day28_loops;
import java.util.*;


public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();  //random.nextInt(21)
        String password = ""; // popular interview question

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); // 71 COMES FROM STRING SOURCE...TOTAL OF CHARACTER NUMBER
            System.out.print(source.charAt(index));
            //add the char o password variable using +=
            password += source.charAt(index); // ---> password = password + source.charAt(index)

           // System.out.print(random.nextInt(source.length()));
        }
        System.out.println("\nYour password = " + password);


    }
}
