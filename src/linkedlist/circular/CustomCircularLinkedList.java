package linkedlist.circular;

import java.util.NoSuchElementException;

public class CustomCircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    CustomCircularLinkedList() {
        this.size = 0;
    }

    // Insert at the beginning
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
            tail.next = head;
            size++;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }

    // Insert at the ending
    public void insertLast(int value) {
        if (isEmpty()) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        node.next = head;
        size++;
    }

    // Insert at a particular index
    public void insert(int index, int value) {
        checkInsertIndex(index);
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        Node previous = get(index - 1);
        previous.next = new Node(value, previous.next);
        size++;
    }

    // Delete at the beginning
    public int deleteFirst() {
        checkEmpty();
        if(size == 1) {
            int value = head.value;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.value;
        head = head.next;
        tail.next = head;
        size--;
        return value;
    }

    // Delete at the ending
    public int deleteLast() {
        checkEmpty();
        if(size == 1) return deleteFirst();
        Node secondLast = get(size - 2);
        int value = secondLast.next.value;
        secondLast.next = head;
        tail = secondLast;
        size--;
        return value;
    }

    // Delete at a particular index
    public int delete(int index) {
        checkAccessIndex(index);
        if(index == 0) return deleteFirst();
        if(index == size - 1) return deleteLast();
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return value;
    }

    // Display the linked list
    public void display() {
        if(isEmpty()) return;
        Node temp = head;
        do {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != head) System.out.print(" -> ");
        } while (temp != head);
    }

    // Retrieve element as per index
    private Node get(int index) {
        checkAccessIndex(index);
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Custom exception function for delete
    private void checkEmpty() {
        if(isEmpty()) throw new NoSuchElementException("List is empty. you cant perform a delete operation");
    }

    // check access index
    private void checkAccessIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    // check insert index
    private void checkInsertIndex(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}