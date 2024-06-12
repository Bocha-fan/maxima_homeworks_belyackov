package homeworks_2;

/*
Напишите метод maxOfThree, который принимает три целых числа и возвращает наибольшее из них.
Используйте условный оператор if.
*/

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        maxOfThree();
    }
    public static void maxOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number number_a ");
        int number_a = scanner.nextInt();
        System.out.println(" Enter the number number_b ");
        int number_b = scanner.nextInt();
        System.out.println(" Enter the number number_c ");
        int number_c = scanner.nextInt();

        if (number_a > number_b  && number_a > number_c ) {
            System.out.println(" Prints the largest number " + number_a);
        } else if (number_b > number_c) {
            System.out.println( " Prints the largest number " + number_b);
        } else {
            System.out.println( " Prints the largest number " + number_c);
        }

    }
}

