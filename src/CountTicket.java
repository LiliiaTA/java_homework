public class CountTicket {
    private final int length;
    public CountTicket(int length){
        this.length=length;
    }
    public int countAmountTicket() {
        int count = 0;
        for (int i = 0; i < Math.pow(10, getLength()); i++) {
            Ticket ticket = getInstance(i);
            if (ticket.isLucky()) {
                count++;
            }
        }
        return count;
    }

    protected Lucky getInstance(final int length, final int number){

        return new TicketImpl(length, number);
    }

    public int getLength(){
        return length;
    }
}

