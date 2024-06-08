package homeworks_1;

import java.util.Scanner;

//Вычитание двух чисел, с водом переменной
public class Vichitanie_s_vod_peremenoy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите первую переменную Per_a:");
        int Per_a = scanner.nextInt();
        System.out.println("Введите первую переменную Per_b:");
        int Per_b = scanner.nextInt();
        short result_c = (short) (Per_a-Per_b);
        System.out.println("Результат вычисления вычитания:");
        System.out.println(result_c);
    }
}
