package day47_constructors;

import java.util.concurrent.CyclicBarrier;

public class AddressList {
    public static void main(String[] args) {

        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Drive Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22012");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("CybertekSchool address after update : " + cybertekAddress.toString());
        System.out.println("cybertekAddress street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("9595 Main Street, Suite 500");
        newAddress.setCity("Baltimore");
        newAddress.setState("MD");
        newAddress.setZipCode("25878");
        System.out.println(newAddress.toString());

        Address papaJohn = new Address("8501 Tyco road, Suite 1A", "Vienna", "VA", "25485");
        System.out.println("Papa John Pizza: " + papaJohn.toString());

    }
}
