//Задача 5. По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i < n) {
            System.out.printf(" " + i);
            i = i*2;
        }
    }
}

// Задача 6. Известен факториал числа. Найти это число.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}

// Задача 7. Пользователь вводит целое положительное число. Определить является ли оно степенью числа 2.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0)
            System.out.println(number > 0 && (number & -number) == number);
        else
            System.out.println("Ошибка. Это отрицательное число.");
    }
}
