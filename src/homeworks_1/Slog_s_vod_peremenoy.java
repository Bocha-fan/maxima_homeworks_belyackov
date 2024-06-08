package homeworks_1;

import java. util. Scanner;

//Сложение двух чисел, с водом переменной
public class Slog_s_vod_peremenoy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
            System.out.println("Введите первую переменную Per_a:");
            int Per_a = scanner.nextInt();
            System.out.println("Введите первую переменную Per_b:");
            int Per_b = scanner.nextInt();
            System.out.println("Результат вычисления сложения:");
            int result_c = Per_a+Per_b;
            System.out.println(result_c);

    }

}
