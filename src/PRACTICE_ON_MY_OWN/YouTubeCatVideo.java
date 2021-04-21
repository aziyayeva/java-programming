package PRACTICE_ON_MY_OWN;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting: world's smallest cat - BCC");
        int seconds = 0;
        while( seconds <= 117 ) {
            seconds++;   // update for each loop
            System.out.println("Watching youtube video - " + seconds);
            Thread.sleep(250); // 1 sec ==> 1000 miliseconds; pause the code execution for 1000 miliseconds = 1 sec
                                // thread.sleep() -- to activate sleep, bring mouse on top of sleep and choose ->
                                // "Add exception to method signature"

        }

        System.out.println("Finished watching watch Cat Video, lets watch another");

    }
}
