package day09_casting_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed:");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving over the limit: " + overTheLimit + " mph - slowdown");


    }

}
