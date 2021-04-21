package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {

    //    getDayName(10);
        getDayName2(2);

    }

    public static String getDayName(int day) {

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;

        }
    }
    public static String getDayName2 (int day) {
        String dayName;
        switch(day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName=null;
        }
        return dayName;

    }
}
