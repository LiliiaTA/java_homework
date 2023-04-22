// Задача 1. Пользователь вводит с клавиатуры целые числа (по одному числу).
// По окончании ввода всех чисел пользователь вводит строку end.
// Написать на языке Java программу, вычисляющую сумму всех чисел, введенных пользователем.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целые числа через Enter, по окончании ввода введите слово end");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            sum +=number;
            if (scanner.hasNext("end"))
                break;
        }
        System.out.printf("Сумма всех чисел: " + sum);
    }
}

// Задача 2. Пользователь вводит с клавиатуры целые числа (по одному числу).
// По окончании ввода всех чисел пользователь вводит строку end.
// Написать на языке Java программу, вычисляющую минимальное из всех чисел, введенных пользователь.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целые числа через Enter, по окончании ввода введите слово end");
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int number = 0;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (min > number)
                min = number;
            if (scanner.hasNext("end"))
                break;
        }
        System.out.printf("Минимальное из всех чисел: " + min);
    }
}

// Задача 3. Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.

public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++){
            if (number%5==0)
            System.out.printf(number + " ");
        }
    }
}

// Задача 4. По данному натуральному n вычислите сумму 1²+2²+3²+...+n².

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = input("Введите натуральное число n: ");
        int result = 0;
        for (int i=1; i <= n; i++)
            result += i*i;
        System.out.printf("Результат: " + result);
    }
    static int input(String prompt){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt())
                return sc.nextInt();
            System.out.println("Это ненатуральное число");
            sc.nextLine();
        }
    }
}
