package day09_casting_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate");
        double HourlyRate = 40;
        double weeklyPay = HourlyRate * 36.5;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
        System.out.println("Annual pay: " + annualPay);

    }
}
