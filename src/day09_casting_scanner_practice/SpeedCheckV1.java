package day09_casting_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 70;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving over the limit: " + overTheLimit + " mph - slowdown");

    }
}
