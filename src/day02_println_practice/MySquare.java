package day02_println_practice;

public class MySquare {
    public static void main(String[] args) {

        {
            int count = 15;

            // Внешний цикл
            for (int i = 0; i < count; i++) {
                for (int k = 0; k < i + 1; k++) {
                    // Здесь условие даже немного проще
                    if (k == 0 || k == i || i == count - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Переход на следующую строку
                System.out.println();
            }

        }
    }


}





