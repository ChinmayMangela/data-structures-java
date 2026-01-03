package linkedlist.doubly;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        list.insertFirst(12);
        list.insertFirst(323);
        list.insertFirst(23);
        list.insertLast(78);
        list.insertLast(587);
        list.insert(4, 3);
        list.display();
        System.out.println();
        list.delete(5);
        list.display();
    }
}
