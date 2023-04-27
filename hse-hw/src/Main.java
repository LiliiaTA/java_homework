import mypackage.PascalTriangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = input("n= ");
        PascalTriangle.show(n);
    }

    private static boolean isPalindrom(String s) {
        if (s.charAt(0) != s.charAt(s.length() -1))
            return false;
        return isPalindrom(s.substring(1, s.length() - 1));
    }

    static int input(String prompt) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            if (sc.hasNextInt())
                return sc.nextInt();
            System.out.println("Error");
            sc.nextInt();
        }
    }
}

