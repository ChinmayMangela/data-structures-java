package linkedlist.singly;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(23);
        list.insertFirst(13);
        list.insertFirst(89);
        list.insertFirst(2);
//        System.out.println(list.contains(24));
//        list.display();
//        System.out.println();
//        list.deleteLast();
//        list.deleteFirst();
//        list.display();
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(89));
        list.insert(5, 99);
        list.display();
        list.clear();
        list.display();
    }
}
