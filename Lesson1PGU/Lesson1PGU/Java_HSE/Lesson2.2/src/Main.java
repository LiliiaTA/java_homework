/*
Задача 5. Пользователь вводит натуральное число.
▪ Если число четное, то необходимо разделить его
пополам.
▪ Если нечетное – умножить на 3, прибавить 1 и
разделить пополам.
Повторить перечисленные действия с вновь
полученным числом.

Гипотеза гласит, что независимо от выбора первого
числа рано или поздно будет получено число 1.
Необходимо разработать программу, проверяющую
гипотезу. Вывести текущее число на каждой итерации и
итоговое число итераций.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        int count=0;
        while (n!=1){
            if (n%2==0)
                n/=2;
            else
                n=(n*3+1)/2;
            count++;
            System.out.printf("%d", n);
        }
        System.out.printf("\nПроверка заняла %d шага(ов).", count);
    }
}