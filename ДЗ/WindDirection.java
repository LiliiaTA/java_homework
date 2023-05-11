import java.util.Random;

public class WindDirection {
    public static void main(String[] args) {
        final int n = 365;
        final int m = 8;
        int[] a = new int[n];
        int[] b = new int[m];
        int imn;

        Random random = new Random();

        System.out.println("Закодированное направление ветра по дням:");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(8) + 1;
            System.out.printf("%2d", a[i]);
            b[a[i] - 1]++;
        }

        System.out.println("\nКоличество дней по направлениям ветра:");
        imn = 0;
        for (int i = 0; i < m; i++) {
            System.out.printf("%d=%d ", i + 1, b[i]);
            if (b[i] < b[imn]) {
                imn = i;
            }
        }

        System.out.println("\nНаименьшее количество дней с направлением ветра " + imn + "=" + b[imn]);

        System.out.print("Жилой комплекс должен быть по отношению к комбинату на ");
        switch (imn) {
            case 0:
                System.out.print("юге");
                break;
            case 1:
                System.out.print("севере");
                break;
            case 2:
                System.out.print("западе");
                break;
            case 3:
                System.out.print("востоке");
                break;
            case 4:
                System.out.print("юго-западе");
                break;
            case 5:
                System.out.print("юго-востоке");
                break;
            case 6:
                System.out.print("северо-востоке");
                break;
            case 7:
                System.out.print("северо-западе");
                break;
        }
    }
}