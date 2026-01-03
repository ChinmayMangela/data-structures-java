package linkedlist.singly;

import java.util.NoSuchElementException;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    CustomLinkedList() {
        this.size = 0;
    }


    // Insert at the beginning
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at the end
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at a specific index
    public void insert(int index, int value) {
        checkInsertIndex(index);
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node previous = get(index - 1);
        previous.next = new Node(value, previous.next.next);
        size++;
    }

    // Delete first node
    public int deleteFirst() {
        ensureNotEmpty();
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    // Delete last node
    public int deleteLast() {
        ensureNotEmpty();
        if (size == 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    // Delete at a specific index
    public int delete(int index) {
        checkAccessIndex(index);
        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteLast();
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return value;
    }

    // Get node at index
    private Node get(int index) {
        checkAccessIndex(index);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Index validation
    private void checkInsertIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid insert index: " + index);
        }
    }

    private void checkAccessIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid access index: " + index);
        }
    }

    // Empty list check
    private void ensureNotEmpty() {
        if (head == null) {
            throw new NoSuchElementException("List is empty. Cannot perform delete operation.");
        }
    }

    // Return size
    public int size() {
        return size;
    }

    // Empty list check without any exception
    public boolean isEmpty() {
        return head == null;
    }


    // Return first element
    public int getFirst() {
        if (isHeadNull()) throw new NoSuchElementException("List is empty");
        return head.value;
    }


    // Return last element
    public int getLast() {
        if (size <= 1) {
            return getFirst();
        }
        return tail.value;
    }


    // Check if list contains element
    public boolean contains(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }


    // Get the index of a specific value
    public int indexOf(int value) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value == value) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }


    // Check if head is null
    private boolean isHeadNull() {
        return head == null;
    }


    // Display the linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }

    private static class Node {
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
