package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String s = "роза упала на лапу азора";
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;
        System.out.println(Arrays.toString(words));
        s = String.join(" ", words);
        System.out.println(s);
        
        //System.out.println(Arrays.toString(s.split(" ")));
    }
}



//        String s = "А роза  упала на лапу Азора";
//        boolean r = true;
//
//        s = s.replace(" ", "");
//        s = s.toLowerCase();
//        int l = s.length();
//        boolean r = true;
//        for (int i = 0; j = l - 1; i < l/2; i++; j--)
//            if (s.charAt(i) != s.charAt(j))
//                return false;
//            return r;
//    }
//}

// private static boolean isPalidrom(String)

//        String s = "Аргентина манит негра";
//        String s1 = s.toLowerCase();
//        String s2 = s1.trim();
//        System.out.println(s2);

//    String s1 = "Ананас";
//    String s2 = "Арбуз";
//    System.out.println(s2.compareTo(s1));

//        int n = 6;
//        int[] prevRow = {1};
//        for (int j = 0; j < n; j++) {
//            int[] row = new int[j + 1];
//            for (int i = 0; i <= j; i++) {
//                if (i == 0 || i == j) row[i] = 1;
//                else row[i] = prevRow[i - 1] + prevRow[i];
//                System.out.printf("%-4d", row[i]);
//            }
//            System.out.println();
//        }
//    }
//}

//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i <= j; i++)
//            System.out.printf("%3d", pascal(j, i));
//            System.out.println();

//    public static int pascal(int r, int c) {
//        if (c==0 || r==c)
//            return 1;
//        else
//            return pascal(r-1, c)+pascal(r-1, c-1);
//    }
//}

//// факториал
//        System.out.println(fact_rec(5));
//    }
//
//    static int fact_rec(int n) {
//        if (n == 0)
//            return 1;
//        else
//            return fact_rec(n - 1) * n;
//    }
//}

//     static  int fact_iter(int n) {
//        int r = 1;
//        for (int i = 2; i <= n; i++) {
//            r*=i;
//        }
//        return r;
//    }


//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        System.out.println ("Вы ввели число " + number);

//          //авто-ки
//          int [] [] twoDimArr = new int[10] [5];
//
//          //вручную
//          int[] [] twoDimArr = new int[10][];
//          for (int i = 0; i < 10; i++)
//              twoDimArr[i] = new int[i];

//            int[] [] arr = {{30, 5254, 9}, {0, 1}, {10, 30, 20}};
//            for (int j = 0; j < arr.length; j++) {
//                for (int i = 0; i < arr[j].length; i++)
//                    System.out.printf("%5d", arr[j][i]);
//                System.out.println();
