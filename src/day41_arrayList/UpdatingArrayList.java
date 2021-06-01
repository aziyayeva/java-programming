package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("Moskvich");
        myCars.add(0, "Jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");
        myCars.add("tesla");

        System.out.println(myCars.toString()); // prints all cars
        String allCarsIn1St = myCars.toString(); // saves all cars in 1 string variable

        System.out.println();
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars.toString());; //jeep is gone

        myCars.set(4,"honda");
        System.out.println("after set = " + myCars.toString());; //mazda is gone

        /**
         * how would do that if myCar was an array:
         * myCars[4] = honda;

         String `str = "java";
         str.indexOf("v") ==> 2
         */

        // find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvich index = " + moskvichIndex);

        //change moskvich to jiguli
        myCars.set(moskvichIndex,"jiguli");
        System.out.println("after set to jiguli = " + myCars);

        //replace ford with trabant
        //indexOf("ford", trabant)

        myCars.set(myCars.indexOf("ford") , "trabant"); // replacing ford with trabant
        System.out.println(myCars);

        int lada = myCars.indexOf("lada");
        if(myCars.contains("lada") ) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }

        System.out.println("after set bugatti = " + myCars.toString());

        /**
          lamborghini - > prius
          lada --> lexus
          trabant -> audi
         */

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")){
                myCars.set(myCars.indexOf("Lamborghini"), "prius");

            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(myCars.indexOf("toyota"), "lexus"); // OR myCars.set(i, lexus);

            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(myCars.indexOf("trabant"), "audi");

                }else{
                    System.out.println("Lambo, Lada, Trabant are not found");

                }
            System.out.println("myCars = " + myCars.toString());

            }

        }

    }

