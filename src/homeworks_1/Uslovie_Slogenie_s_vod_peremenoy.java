package homeworks_1;

import java.util.Scanner;

//Сложение и умножение двух чисел, с вводом переменной и условием

public class Uslovie_Slogenie_s_vod_peremenoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную Per_a:");
        int Per_a = scanner.nextInt();
        System.out.println("Введите первую переменную Per_b:");
        int Per_b = scanner.nextInt();
        int result_c ;
        if ((Per_a + Per_b) < 0) {
            System.out.println("Я не хочу работать с отрицательными числами при сложении");

        } else if ((Per_a + Per_b) > 0) {
            System.out.println("Результат вычисления сложения:");
            result_c = Per_a + Per_b;
            System.out.println(result_c);
        }
        if ((Per_a * Per_b) < 0) {
            System.out.println("Я не хочу работать с отрицательными числами при умножении");

        } else if ((Per_a * Per_b) > 0) {
            System.out.println("Результат вычисления уножения:");
            result_c = Per_a * Per_b;
            System.out.println(result_c);
        }
    }
}
