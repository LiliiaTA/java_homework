public interface Ticket extends Lucky{
    int getLength();
    int getNumber;

    boolean isLucky;

}
class TicketImpl{
    private final int length;
    private final int number;

    public TicketImpl(int length, int number){
        this.length =length;
        this.number = number;
    }

    public int getLength(){
        return length;
    }
    public int getNumber(){
        return number;
    }

    public boolean isLucky(){
        int n1 = number / 100000 % 10;
        int n2 = number / 10000 % 10;
        int n3 = number / 1000 % 10;
        int n4 = number / 100 % 10;
        int n5 = number / 10 % 10;
        int n6 = number % 10;
        return ((n1+n2+n3)==(n4+n5+n6));
    }
}




