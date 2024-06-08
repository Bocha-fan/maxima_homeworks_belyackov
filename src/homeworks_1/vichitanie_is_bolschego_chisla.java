package homeworks_1;

import java.util.Scanner;

//В вычитании двух чисел сделать так, что бы вычитание происходило всегда из бОльшего числа

public class vichitanie_is_bolschego_chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную Per_a:");
        int Per_a = scanner.nextInt();
        System.out.println("Введите первую переменную Per_b:");
        int Per_b = scanner.nextInt();
        int result_c;
        if (Per_a > Per_b) {
            System.out.println("Результат вычисления вычитания ");
            result_c = Per_a - Per_b;
            System.out.println(result_c);
        } else if (Per_a < Per_b) {
            System.out.println("Результат вычисления вычитания:");
            result_c = Per_b - Per_a;
            System.out.println(result_c);
        }
    }
}
