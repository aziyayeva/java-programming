package PRACTICE_ON_MY_OWN;

public class ReverseSentenceArrayII {
    public static void main(String[] args) {
        String str = "java is fun";
        String[] arr = str.split(" ");
        String temp="";
        for (int i= arr.length-1; i>=0; i--) {
            temp += arr[i] + " ";
        }
        System.out.println(temp);
    }
}


