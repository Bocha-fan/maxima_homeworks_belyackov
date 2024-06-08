package homeworks_1;

import java.util.Scanner;
//Задача под звездочкой. Написать программу, которая вычисляет факториал через цикл:)

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную Per_a:");
        int Per_a = scanner.nextInt();
        System.out.println("Введите первую переменную Per_b:");
        int Per_b = scanner.nextInt();
        int factorial=1;
        for (Per_a = 1; Per_a <= Per_b; Per_a ++)
            factorial= factorial * Per_a;
        System.out.print(factorial);
    }
}
