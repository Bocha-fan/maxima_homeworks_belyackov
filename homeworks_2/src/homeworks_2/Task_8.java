package homeworks_2;
/*
1.1
Напишите метод minMax, который принимает массив целых чисел и возвращает массив из двух элементов:
минимального и максимального значений в данном массиве.
 */

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter the number: " + (i + 1) + ":");
            array[i] = scanner.nextInt();}
        int[] minMax = minMax(array);
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
    }

    public static int[] minMax(int[] array) {
        Object[] array1 = new Object[0];
        for (int i = 0; i < array1.length; i++) {
            if (null == array1[i]) {
                System.out.println("Array element" + i + " Yes null");
            } else {
                System.out.println("Array element " + i + " No null");
            }
        }
        if (array1.length == 0) {
            System.out.println("Array is null");
        } else {
            System.out.println("Array No null");
        }
        int min = array[0];
        int max = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        return new int[]{min, max};
    }
}