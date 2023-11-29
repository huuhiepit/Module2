package Practice.arraylist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("************** TESTING **************");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);

        ll.add(4,8);
        ll.add(2, 9);
        ll.printList();

    }
}
