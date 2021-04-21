package PRACTICE_ON_MY_OWN;
import java.util.Arrays;

public class ZombieAttackIIArray {
    public static void main(String[] args) {

                int[] population = {0, 7, 0, 2, 3, 7, 0, 2}; //Arrays.copyOf

                boolean done = true;
                int day = 0;

                do {
                    System.out.println("Day " + (day++) + " " + Arrays.toString(population));

                    for (int i = 0; i < population.length; i++) {
                        if (i == 0) {
                            if (population[i + 1] == 0) {
                                population[i] = population[i] / 2;
                            }
                        } else if (i == population.length - 1) {
                            if (population[i - 1] == 0) {
                                population[i] = population[i] / 2;
                            }
                        } else {
                            if (population[i - 1] == 0 || population[i+1] == 0) {
                                population[i] = population[i] / 2;
                            }
                        }
                    }

                    done = true;
                    for (int s : population) {
                        if (s > 0) {
                            done = false;
                        }
                    }
                } while (!done);

                System.out.println("Day " + day + " " + Arrays.toString(population));

            }
        }
