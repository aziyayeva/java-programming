package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {  // will be used as a runner

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.name = "Anna";
        emp1.jobTitle = "SDET";
        System.out.println(emp1.name + " works as " + emp1.jobTitle);

        emp2.name = "Alex";
        emp2.jobTitle = "Full stack developer";
        System.out.println(emp2.name + " works as " + emp2.jobTitle);

        emp3.name = "Liza";
        emp3.jobTitle = "Web Developer";
        System.out.println(emp3.name + " works as " + emp3.jobTitle);


    }
}
