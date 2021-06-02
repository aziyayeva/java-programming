package day47_constructors;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //No args constructor
    public Student() {
        System.out.println("No-Args constructor");
    }
    //constructor with name
    public Student(String name){
        System.out.println("Student Name: " + name);
    }

    //constructor with age
    public Student(int age) {
        System.out.println("age param constructor | age = " + age);
    }

    //constructor with name and age
    public Student(String name, int age) {
        System.out.println("name & age param constructors | " + name + "-" + age);
    }

}
