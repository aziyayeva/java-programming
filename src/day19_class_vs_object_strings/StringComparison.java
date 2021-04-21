package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {

        String city = "NYC";
        //EQUALS() method - CASE SENSITIVE COMPARISON
        System.out.println(city.equals("NYC")); //TRUE
        System.out.println(city.equals("nyc")); //FALSE - CASE SENSITIVE
        System.out.println(city.equals("NYC ")); //FALSE - SPACE CHARACTER

        //EqualsIgnoreCase() method - CASE INSENSITIVE COMPARISON

        System.out.println(city.equalsIgnoreCase("NYC")); //true
        System.out.println(city.equalsIgnoreCase("nyc")); //true
        System.out.println(city.equalsIgnoreCase("NyC")); //true
        System.out.println(city.equalsIgnoreCase("NyC  ")); //false

        if(city.equals("nYC")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("NYc")) {
            System.out.println("equalsIgnoreCase() true");
        } else {
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
