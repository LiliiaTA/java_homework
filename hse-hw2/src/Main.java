import mypackage.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(7, 7, 1);
        var t1 = new Triangle(15, 15, 14);
        System.out.println(t.area());
        System.out.println(Triangle.getCounter());
    }
}