package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Lets watch: World's smallest cat - BBC");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("Watching YouTube video: " + seconds);
            seconds++;
            Thread.sleep(1000); // means pause in loop (1 second at a time)  1000 milsec = 1 sec


        }
        System.out.println("Finished watching Cat video, lets start another one");

        }




    }



