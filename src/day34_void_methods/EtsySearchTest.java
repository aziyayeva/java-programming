package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {

        openBrowser();       // custom methods
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test completed - Pass -");
        System.out.println("");

    }
    public static void openBrowser() {
        System.out.println("1. Open your Google Chrome and make it opens");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("2. Type etsy.com and hit enter - pass");

    }
    public static void searchForWoodenSpoon() {
        System.out.println("3. Search for wooden spoon in the search engine");

    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("4. Once open, scroll up and down and se if all wooden spoons are on the display");
    }
}
