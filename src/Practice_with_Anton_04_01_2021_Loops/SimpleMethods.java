package Practice_with_Anton_04_01_2021_Loops;
import java.util.Arrays;

public class SimpleMethods {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

        boolean done = true;
        int day = 0;
        do {
            System.out.println("Day " + (day++) + " " + Arrays.toString(inhabitants));

            for (int i = 0; i < inhabitants.length; i++) {
                if (i == 0) {
                    if (inhabitants[i + 1] == 0) {
                        inhabitants[i] = inhabitants[i] / 2;
                    }
                } else if (i == inhabitants.length - 1) {
                    if (inhabitants[i - 1] == 0) {
                        inhabitants[i] = inhabitants[i] / 2;
                    }
                } else {
                    if (inhabitants[i - 1] == 0 || inhabitants[i+1] == 0) {
                        inhabitants[i] = inhabitants[i] / 2;
                    }
                }
            }

            done = true;
            for (int s : inhabitants) {
                if (s > 0) {
                    done = false;
                }
            }
        } while (!done);

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

    }
}

