package day41_arrayList;


import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arrayList - > add methods

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Baltimore");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to to 0 index
        cities.add(0, "Ashgabat");
        System.out.println(cities);
        //print fist city and last city




        //for loop and print all values in the same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");

        }
        System.out.println();
        //for each loop
        for(String city : cities){
            System.out.print(city + " ");
        }

        //delete item from arraylist
        //remove using index...delete value at index 3
        System.out.println();
        System.out.println();
        cities.remove(3);
        // remove using object / value
        cities.remove("New York");

        System.out.println("After remove: " + cities);

        // delete / remove all values
        cities.clear();

        // firth method - make sure it is clear --> print it out
        System.out.println("cities = " + cities);

        // second method to make it clear
        if(cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //Third check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");

        }



    }

}
