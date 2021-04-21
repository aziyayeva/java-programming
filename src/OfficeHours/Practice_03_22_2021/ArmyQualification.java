package OfficeHours.Practice_03_22_2021;

public class ArmyQualification {
    public static void main(String[] args) {

        String citizenship = "USA";
        boolean resident = true;

        // IF YOU GET ALL 3 STATEMENTS ARE TRUE ---> "You are qualified for the US Army"


        if(citizenship.equalsIgnoreCase("USA") || resident) {

            int age = 18;
            boolean hasDiploma = true;

            if(age >= 18 && age <= 35) {

                if(hasDiploma) {
                    System.out.println("You are qualified for the US Army");

                } else {
                    System.out.println("You must have a high school diploma");

            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }

    }
} }