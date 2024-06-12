package homeworks_2;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя 10 чисел и сохраняет их в массив.
Программа должна затем вывести только положительные числа из этого массива.
Используйте цикл for и условный оператор if
*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number of numbers requested ");
        int length = scanner.nextInt();
        int[] number = new int[length];
        for (int i = 0; i < number.length; i++) {
            System.out.println(" Enter the number "+ (i + 1) + ":");
            number[i] = scanner.nextInt();
        }
        for (int j : number)
            if (j > 0)
                System.out.println("Positive numbers: " + j);


    }
}









