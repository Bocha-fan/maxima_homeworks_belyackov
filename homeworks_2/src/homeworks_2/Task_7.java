package homeworks_2;

/*
Напишите метод power, который принимает два целых числа base и exponent, и возвращает результат возведения base в
степень exponent. Используйте цикл for.
 */

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number base ");
        long base = scanner.nextInt();
        System.out.println(" Enter the number exponent ");
        int exponent = scanner.nextInt();
        long result = power(base, exponent);
        System.out.println("Result of construction " + base + " to the degree " + exponent + " equals " + result);
    }
    public static long power(long base, int exponent) {
        long result = 1; //
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
}



