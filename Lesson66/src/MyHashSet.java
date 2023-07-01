import java.util.ArrayList;

public class MyHashSet {
    private ArrayList<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(Integer element) {
        if (!contains(element)) {
            set.add(element);
        }
    }

    public String toString() {
        return set.toString();
    }

    public Integer getElement(int index) {
        if (index >= 0 && index < set.size()) {
            return set.get(index);
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }

    private boolean contains(Integer element) {
        return set.contains(element);
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(10);
        myHashSet.add(20);
        myHashSet.add(30);
        myHashSet.add(20); // не будет добавлен, так как уже существует

        System.out.println(myHashSet.toString());

        try {
            Integer element = myHashSet.getElement(1);
            System.out.println("Element at index 1: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
