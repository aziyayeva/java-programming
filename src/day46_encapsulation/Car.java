package day46_encapsulation;

public class Car {
    private String model;
    private int carYear;
    private double mileage;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int year) {

    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double miles) {
        miles = mileage;
    }

}
