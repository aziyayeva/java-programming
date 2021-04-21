package day32_arrays_splits;
///FINISH THIS ONE

public class MaxMinPrice {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};




        double numMax = 0;
        double numMin = prices[0];
        int indexOfMaxPrice = 0;

        for(int i = 0; i < prices.length; i++ ) {
            if(prices[i] > numMax) {
                numMax = prices[i];
                indexOfMaxPrice = i;

                if(prices[i] < numMin) {
                    numMin = prices[i];
                }

            }
        }
        System.out.println("Max Price - $" + numMax);
        System.out.println("Index Of Max Price = " + indexOfMaxPrice);
        System.out.println("Min Price - $" + numMin);
    }


}
