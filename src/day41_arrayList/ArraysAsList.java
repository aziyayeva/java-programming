package day41_arrayList;

import com.sun.javafx.collections.FloatArraySyncer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 13, 1, 15, 654);
        System.out.println("nums = " + nums);
        //nums.add(100);   UnsupportedOperationException
        //nums.remove(0);   UnsupportedOperationException
        //nums.clear();   UnsupportedOperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 23, 5344, 100));
        numsList.add(23);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke",
                                                                        "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " ---> " + caffeineAmount);
            } else if(drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " ---> " + caffeineAmount);

            } else if (drink.equals("pepsi") || drink.equals("coke") || drink.equals("tea") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + " ---> " + caffeineAmount);
            }
        }

        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + "->" + caffeineAmount);
                    break;
                case "coffee": case "Kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + "->" + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + "->" + caffeineAmount);
                    break;
            }
        }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(drink -> {
            System.out.println("this is forEach block");
            System.out.println("drink = " + drink);
        });
    }
}
