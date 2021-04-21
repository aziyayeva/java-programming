package day28_loops;

/**
 * add new package day28_loops
 *
 * add new class JavaCityCases
 *
 * int totalCases = 0;
 * loop day = 1 till day 30
 *
 * every day there are 200 new cases
 *
 * every sunday(day % 7 == 0) there are 500 new cases
 *
 * "day 1 - daily cases: 200"
 *
 * --------------
 *
 * print totalCases =
 */

public class JavaCityCases {
    public static void main(String[] args) {

        int totalCases = 0;
        for (int day = 1; day <= 30; day++) {
            if(day % 7 == 0) {
                totalCases += 500; // SUNDAYS MORE CASES BY 500 NEW CASES.
            } else {
                totalCases += 200;
            }

            System.out.println("Day " + day + " | total cases " + totalCases);

        }

        System.out.println("JavaCity 11/2021 Total Cases: " + totalCases);
    }
}
