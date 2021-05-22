package day45_oop;

public class Coffee {
    /**
     * can be 0 - 100 as a pecentage
     */
    int amount;
    String coffeeType;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", coffeeType='" + coffeeType + '\'' +
                '}';
    }

    public void refill() {
        amount = 100;
    }

    public void drink (int someAmount) {
        amount -= someAmount;
    }
     public int getAmount () {
        return amount;
     }

     public void setType (String newType) {
        coffeeType = newType;
     }

     public String getType () {
        return coffeeType;
    }

}
