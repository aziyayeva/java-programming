package day35_methods_with_parameters;

public class Email {
    public static void main(String[] args) {
        buildEmail("Anna", "whitehouse.gov");
        buildEmail("AZ", "CIA.gov");
        buildEmail("John Ward III", "verizon" );


    }
     public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
      //  String email = name + "@" + domain + ".com";
        System.out.println(name + "@" + domain);


     }
}
