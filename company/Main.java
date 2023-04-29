package com.company;
import mypackage.Triangle;
import mypackage.PascalTriangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            method(0);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("End");
        }
    }

    private static void method(int b) throws PersonalException
    {
            if (b==0)
                throw new PersonalException();
//                throw new IllegalArgumentException("Недопустимое значение 0");

            try{
            int a = 5;
//            int b = 1;
            int c = a/b;
            String s = null;
            s.toLowerCase();
            System.out.println("c=" + c);
        }
            catch (ArithmeticException ex) {
                System.out.println("Деление на ноль.");

            }
            catch (Exception ex)
            {
                System.out.println("В методе произошла ошибка...");
                throw ex;
            }
        }

}








//        Talkable[] shelter =
//                {new Dog("Шарик"), new Cat("Мурзик"),
//                        new Dog("Тузик"), new Cat("Барсик"),
//                new Radio()}; //полиморфизм
//
//        for (Talkable t: shelter)
//            t.talk();
//
//        Weekday today = Weekday.Суббота;
//        if (today==Weekday.Суббота || today==Weekday.Воскресенье)
//            System.out.println("Weekend");
//        else
//            System.out.println("Working day");


//        //Animal a = new Animal();
//        Animal d = new Dog("Шарик");
//        d.show();
////        d.talk();
////        System.out.println(d.toString());
//        System.out.println();
//        Animal c = new Cat("Мурзик");
//        c.show();
//    }
//}


