package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testing, maven, cucumber";

        // first comma
        System.out.println(technologies.indexOf(",")); // 4
        //last comma
        System.out.println(technologies.lastIndexOf(",")); //41
        //for middle one, we need to loop

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index = " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index = " + indexOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index = " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");             // word cannot be found, means -1.
        System.out.println("sql is at index = " + indexOfSql);






    }
}
