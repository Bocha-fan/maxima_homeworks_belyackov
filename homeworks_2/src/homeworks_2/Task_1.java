package homeworks_2;

import java.util.Random;
import java.util.Scanner;

/* Напишите программу, которая случайным образом загадывает число от 1 до 100. Вот код, который генерирует случайное
число от 1 до 100:
Random random = new Random();
int randomNumber = random.nextInt(100) + 1;
Пользователь должен угадать это число, вводя свои варианты.
Программа должна указывать, больше или меньше введённое число по сравнению с загаданным, пока пользователь не угадает.
*/
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int usersNumber;
        for (int i = 1; i < 100; i++) {
            System.out.println(" Enter the number of your option ");
            usersNumber = scanner.nextInt();
            if (randomNumber == usersNumber) {
                System.out.println("The user guessed the number");
                return;
            } else if (usersNumber < randomNumber) {
                System.out.println("The entered number is less than the hidden number:");
                System.out.printf("Planned number is %d%n", randomNumber);
                return;
            }
            if (usersNumber > randomNumber) {
                System.out.println("The entered number is greater than the hidden number:");
                System.out.printf("Planned number is %d%n", randomNumber);
                return;
            }
        }
    }
}










