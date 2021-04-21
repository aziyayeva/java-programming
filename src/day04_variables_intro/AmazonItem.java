package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args) {
        String description = "HIC wooden spoon"; // String will be used for word characters always in double quotes....
        int ratingsCount = 181;
        double price = 5.99; // double always for decimal....-----declaring a decimal number
        String seller = "Amazon.com";
        boolean primeDelivery = true;
        //String primeDelivery = "yes"; --- you can use this method as well.

        System.out.println(" --- PRODUCT INFORMATION ---");
        System.out.println("");
        System.out.println("Description of the Product = " + description);
        System.out.println("Rating Count =  *****  " + ratingsCount);
        System.out.println("Seller = " + seller);
        System.out.println("Price = $" + price);
        System.out.println("Prime Delivery = " + primeDelivery);



        


    }
}
