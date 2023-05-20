// Вывести кол-во счастливых билетов


public class Main {
    public static void main(String[] args) {
        CountTicket counter = new CountTicket();
        System.out.println(ticket.countAmountTicket);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 1000000; i++) {
//            int n1 = i / 100000 % 10;
//            int n2 = i / 10000 % 10;
//            int n3 = i / 1000 % 10;
//            int n4 = i / 100 % 10;
//            int n5 = i / 10 % 10;
//            int n6 = i % 10;
//
//            int sum1 = n1 + n2 + n3;
//            int sum2 = n4 + n5 + n6;
//
//            if (sum1 == sum2) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int result = 0;
//        for (int i=0; i < 1000000; i++){
//            int first = getDigitsSum(i/1000);
//            int last = getDigitsSum(i%1000);
//            if(first==last){
//                result++;
//            }
//        }
//        System.out.println("Всего %d счастливых билетов", result);
//    }
//
//}