package homeworks_2;

import java.util.Scanner;

/* Напишите программу, которая запрашивает у пользователя 5 чисел, сохраняет их в массив и находит максимальное
 число в этом массиве. Используйте цикл for и условный оператор if.
 */
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" Enter the number: " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        int max_number = Integer.MIN_VALUE; //Минимальное значение типа int
        for (int number : numbers) {  //
            if (number > max_number) {
                max_number = number;
            }
        }
        System.out.println(" Max number: "  + max_number);
    }
}
