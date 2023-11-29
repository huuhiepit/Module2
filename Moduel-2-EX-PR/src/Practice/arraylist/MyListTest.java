package Practice.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        for (int i = 1; i <= 5 ; i++) {
            listInteger.add(i);
        }

        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 1: " + listInteger.get(1));
        System.out.println("Element 0: " + listInteger.get(0));
    }
}
