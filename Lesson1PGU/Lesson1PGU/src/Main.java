// Задача 1. Определить входит ли переменная в диапазон изображенный на рисунке.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("а = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(100 <= a && a <= 2000){
            System.out.println("Входит в диапазон.");
        } else {
            System.out.println("Не входит в диапазон.");
        }
    }
}

// Задача 2. Определить входит ли переменная в диапазон изображенный на рисунке.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("а = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if((a <= -200) || (25 <= a && a <= 1002) || (1500 <= a)) {
            System.out.println("Входит в диапазон.");
        } else {
            System.out.println("Не входит в диапазон.");
        }
    }
}

// Задача 3. Определить четное ли число, которое ввел пользователь

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("number = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 != 0) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }
    }
}


// Задача 4. Определить входит ли переменная в диапазон значений,
// причем в первый диапазон только четные значений, а во второй только нечетные значения.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("а = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(((-299 <= a) && (a <= 500) && (a%2==0)) || ((1000 <= a) && (a <= 1500) && (a%2!=0))) {
            System.out.println("Входит в диапазон.");
        } else {
            System.out.println("Не входит в диапазон.");
        }
    }
}

