package homeworks_1;

import javax.management.PersistentMBean;
import java.util.Scanner;

//В деление двух чисел сделать так, что бы деление происходило всегда бОльшего числа на мЕньшее.

public class Delenie_chisla_is_bol_na_men {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую переменную Per_a:");
        double Per_a = scanner.nextDouble();
        System.out.print("Введите первую переменную Per_b:");
        double Per_b = scanner.nextDouble();
        double result_c;
        if (Per_a > Per_b) {
            System.out.print("Результат вычисления деления:");
            result_c = Per_a / Per_b;
            System.out.println(result_c);
        } else if (Per_a < Per_b) {
            System.out.print("Результат вычисления деления:");
            result_c = Per_b / Per_a;
            System.out.print(result_c);
        }
    }
}