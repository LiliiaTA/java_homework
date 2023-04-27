package mypackage;

public class PascalTriangle {
    public static void show (int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++)
                System.out.printf("%3d", pascal(j, i));
            System.out.println();
        }
    }

    private static int pascal(int r, int c) {
        if (c==0 || r==c)
            return 1;
        else
            return pascal(r-1, c)+pascal(r-1, c-1);
    }
}