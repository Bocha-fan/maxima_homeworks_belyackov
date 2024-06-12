package homeworks_2;

import java.util.Scanner;

/* Напишите метод sumArray, который принимает массив целых чисел и возвращает сумму его элементов.
Используйте цикл for.
 */
public class Task_5 {
    public static void main(String[] args) {

        System.out.println("Sum of its elements "  + sumArray());
    }
    public static int sumArray() {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        int element = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}