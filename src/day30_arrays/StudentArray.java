package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5]; // i want to store 5  Strings ---> see below
        student1[0] = "0188";
        student1[1] = "Anna";
        student1[2] = "Zi";
        student1[3] = "Batch22";
        student1[4] = "202-555-8989";

        String[] student2 = {"0125", "Ann", "Ziy", "B22", "DOB: 01/22/88"};

        System.out.println("Student1 ID = " + student1[0]); // gives you value at index 0
        System.out.println("Student1 firstNAme = " + student1[1]); // gives you value at index 1
        System.out.println("Student1 lastName = " + student1[2]); // gives you value at index 2
        System.out.println("Student1 Batch  = " + student1[3]); // gives you value at index 3
        System.out.println("Student1 phoneNumber = " + student1[4]); // gives you value at index 4

        System.out.println("Student data length = " + student1.length); /// 5 items / elements

        if (student1.length == 5) {                            // check if student1 array length is egual to 5(data)/items/elements
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
        if (student1.length == student2.length) {    // check if "student1" and "student2" array length match if you have more student data
            // you can continue ==student3 ==.......
            System.out.println("Pass: data arrays length match");
        } else {
            System.out.println("Fail: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        System.out.println((student1[1] + " " + student1[2]).toUpperCase()); //because of the () parenthesis both will be converted
        // to UpperCase

        for (int i = 0; i < 5; i++) {
            System.out.println(student2[i]);
        }
    }
}
