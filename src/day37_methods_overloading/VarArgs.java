package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(12, 5, 48, 87, 78, 6, 6, 8, 7);

    }
    public static void addNumbers(int...nums) {
        // inside the method, it is used as regular array
        int sum = 0;
        for(int each : nums){
            sum+=each;
        }
        System.out.println("sum = " + sum);
    }

}
