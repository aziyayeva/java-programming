package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        //print all numbers from prices array that are more than 100

        System.out.println("---- prices less than 100 ----");

        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("");

        System.out.println("\n\n------ prices between 10 and 70 inclusive-----");
        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.print(price + " ");
            }
        }

        System.out.println("\n\n------ count of the prices that are more than 50 -----");
        int count1 = 0;
        for (double price1 : prices) {
            if (price1 > 50) {
                count1 = count1 + 1; // count1++ is the same thing
            }

        }
        System.out.print("count = " + count1);

        System.out.println("\n ----- countries with name more than 7 - inclusive");

        int count = 0;
        for (String name : countries) {
            if (name.length() >= 7) {
                count++;
                System.out.println(name + "-" + name.length() + " ");

            }

            }
        System.out.println("");
            for (String name2 : countries) {
                if (name2.charAt(0) == 'A'|| name2.charAt(0) == 'a') {
                    System.out.println(name2);
                }


            }
            System.out.println("");

            System.out.println("\nTotal count of coutries: ==>" + count);


        }
    }

