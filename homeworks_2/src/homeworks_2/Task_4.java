package homeworks_2;

/* Напишите метод isPrime, который принимает целое число и возвращает true, если число простое,
и false в противном случае. Используйте цикл for и условный оператор if.
 */

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int number1 = scanner.nextInt();
        System.out.println("Check " + number1 + " is simple? " + isPrime(number1));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int number2 = 3;
        for (int i = 3; i <= number2 ; i += 2){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}