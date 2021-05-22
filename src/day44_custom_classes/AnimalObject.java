package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat("grass");
        animal.speak("loudly");

        //create new Animal object cheetahObj

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";
        System.out.println("cheetahObj = " + cheetahObj.type);
        cheetahObj.eat("raw meat");

    }


}
