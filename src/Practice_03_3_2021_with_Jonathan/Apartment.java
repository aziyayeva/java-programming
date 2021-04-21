package Practice_03_3_2021_with_Jonathan;

/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit,
        monthly rent amount, number of washers and driers, allows pets or not,
        has a pool, length of lease, total number of residents in building,
        phone number of owner, is near a gas station, number of floors,
        has a basement, has available units for rent, has air conditioning,
        number of parking spaces, has wheel chair access, number of review stars
        (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
 */

public class Apartment {
    public static void main(String[] args) {

        String address = "125 Good Road";
        String nameOfOwner = "Anna Zi";
        short numberOfUnits = 122;
        double averageSizeOfEachUnit = 975;
        int monthlyRent = 1200;
        short numberWasherAndDrivers = 244;
        boolean petsAllowed = true;
        boolean poolAvailability = true;
        byte leaseLength = 12;
        short numberOfResidents = 250;
        String PhoneNumberOfOwner = "443-904-1535";
        boolean nearGasStation = false;
        byte numberOfFloor = 3;
        boolean hasBasement = false;
        boolean hasAvailableUnits = true;
        boolean hasAirConditioner = true;
        short numberOfParking = 315;
        boolean hasWheelChairAccess = true;
        double numberOfReviewStars = 4.7;

        double monthlyRentAfter3 = monthlyRent - (monthlyRent * .10);
        double monthlyRentAfter6 = monthlyRent - (monthlyRent * .20);
        double averageNumberOfResidentsPerUnit = numberOfResidents / numberOfUnits;
        double averageNumParkingSpotsPerUnit = numberOfParking / numberOfUnits;
        double averageNumOfUnitsPerFloor = numberOfUnits / numberOfFloor;

        System.out.println("$" + monthlyRentAfter3);
        System.out.println("$" + monthlyRentAfter6);
        System.out.println(averageNumberOfResidentsPerUnit + " Residents Per Unit");
        System.out.println(averageNumParkingSpotsPerUnit + " Parking Spots Per Unit");
        System.out.println( averageNumOfUnitsPerFloor + " Units Per Floor");










    }
}
