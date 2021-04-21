package day32_arrays_splits;

public class MallShopping {
    public static void main(String[] args) {

//  indexes for this Array:  0         1          2          3        4        5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};

        System.out.println("--------FIND THE INDEX OF 'Gloves' in the items array ----------");

        // start array  at 0 and until the last value......
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;

            }
        }

        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++) {
            if (items.equals("iPad")) {
                break;
            }
            System.out.println("iPad found at index: ");
        }

        System.out.println("");
        System.out.println("---- Print a report of each item ----");
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item: " + items[i]);
            System.out.println("Price: $" + prices[i]);
            System.out.println("Item ID: " + itemIDS[i]);
            System.out.println("***********************");
            System.out.println("");

        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDS[i]);
        }

        System.out.println("------Print a report of each shopping item----");
        for (int i = 0; i < items.length; i++){
            System.out.println("item: "+items[i]+"\nPrice: $"+prices[i]+"\nItem ID: "+itemIDS[i]+"\n");
        }

        System.out.println("----Look for 'Jacket' and print all details ----- ");
        for (int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")) {
                System.out.print(items[i] + " - $" + prices[i] + " - " + itemIDS[i]);
                System.out.println("");
            }

        }
    }
}
