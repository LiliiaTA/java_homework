/*
Задача 1. Вычислить значение выражения, используя различные вещественные типы
данных (float и double) а=1000, b=0.0001.
 */

public class Main {
    public static void main(String[] args) {
        float a = 1000;
        float b = 0.0001f;
        float r = ((a+b)*(a+b)-(a*a+2*a*b))/(b*b);
        System.out.println(r);
    }
}

/*
Задача 1. Вычислить значение выражения, используя различные вещественные типы
данных (BigDecimal) а=1000, b=0.0001.
 */

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1000);
        BigDecimal b = new BigDecimal(0.0001);
        BigDecimal r1 = a.add(b).multiply(a.add(b)); // (a+b)*(a+b)
        BigDecimal r2 = (a.multiply(b)).multiply(new BigDecimal(2)); // 2*a*b
        BigDecimal r3 = a.multiply(a).add(r2); // (a*a)+(2*a*b)
        BigDecimal r4 = r1.subtract(r3); // (a+b)*(a+b)-(a*a+2*a*b)
        BigDecimal r5 = b.multiply(b); // b*b
        BigDecimal result = r4.divide(r5); // ((a+b)*(a+b)-(a*a+2*a*b))/(b*b)
        System.out.println(result);
    }
}