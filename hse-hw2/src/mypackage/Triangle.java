package mypackage;

public class Triangle {
    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }
    private static int counter =0;
    {
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public Triangle(double a) {
        this(a, a, a);
    }

    public Triangle() {
        this(0, 0, 0);
    }

    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /***
     *  Вычисление площади
     * @return
     */
    public double area() {
        double p=(a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

//    public void setA(double a) {
//        if (a<=0)
//            throw new IllegalArgumentException(
//                    "Сторона треугольника должна быть положительным числом");
//        this.a = a;