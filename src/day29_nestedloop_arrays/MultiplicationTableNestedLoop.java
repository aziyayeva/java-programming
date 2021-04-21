package day29_nestedloop_arrays;

public class MultiplicationTableNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {          // table
            for (int j = 1; j <= 10; j++) {

                System.out.print(i * j +"\t");
            }
            System.out.println("");

        }

                int sum=0;
                for(int i=1; i<=10;i++){      // columns ---> pay attention to "println" bs "print"
                    for(int j=1; j<=10;j++){
                        sum=i*j;
                        System.out.print(i+"*"+j+"="+sum+"\t\t");
                    }
                    System.out.println();
                }


                System.out.println("--------------------------------------------------------------------------------");
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.print("|\t" + i * j + "\t");
                        if (j == 10){
                            System.out.print("|");
                        }
                    }
                    System.out.println("\n--------------------------------------------------------------------------------");
                }

                String word = "Happy Birthday Anca !!!";
                for (int i = 0; i < word.length(); i++) {
                    for(int j = 0; j <= i; j++) {
                        System.out.print(word.charAt(j));
                    }
                    System.out.println();
                }



            }

        }


