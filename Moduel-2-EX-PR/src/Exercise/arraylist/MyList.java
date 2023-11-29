package Exercise.arraylist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }
    public MyList(int capacity) {
        this.size = capacity;
    }

    public void add(int index, E element) {
        elements[index] = element;
    }
//    public E remove(int index) {
//        return ;
//    }
    public int size() {
        return this.size;
    }
}
