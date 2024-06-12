package homeworks_2;
/*
Напишите метод fibonacci, который принимает целое число n и возвращает n-ое число Фибоначчи. Используйте рекурсию.
 */

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int i = scanner.nextInt();
            System.out.println("i - fibonacci number: " + fibonacci(i));
        }

        public static long fibonacci ( int i){
            if (i <= 1) {
                return i;
            } else {
                return fibonacci(i - 1) + fibonacci(i - 2);
            }
        }
    }
