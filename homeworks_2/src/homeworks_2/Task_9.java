package homeworks_2;
/*
Напишите метод contains, который принимает массив целых чисел и целое число target, и возвращает true,
если массив содержит это число, и false в противном случае. Используйте цикл for.
 */

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int target = scanner.nextInt();
        System.out.println("Enter array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number: " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Does the array contain a number " + target + ": " + contains(array, target));
    }

    public static boolean contains(int[] array, int target) {
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
}