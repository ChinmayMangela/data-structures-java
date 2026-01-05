package linkedlist.circular;

public class Main {
    public static void main(String[] args) {
        CustomCircularLinkedList list = new CustomCircularLinkedList();
        list.insertFirst(34);
        list.insertFirst(32);
        list.insertLast(1);
        list.insertLast(55);
        list.display();
        System.out.println();
        list.delete(0);
        list.display();
    }
}
