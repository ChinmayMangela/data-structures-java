package linkedlist.doubly;

import java.util.NoSuchElementException;

class CustomDoublyLinkedList {
    private Node head;
    private int size;

    CustomDoublyLinkedList() {
        this.size = 0;
    }

    // Insert at the beginning
    public void insertFirst(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            size++;
            return;
        }
        node.next = head;
        head.previous = node;
        head = node;
        size++;
    }

    // Insert at the end
    public void insertLast(int value) {
        if(isEmpty()) {
            insertFirst(value);
            return;
        }

        Node last = get(size - 1);
        last.next = new Node(value, last, null);
        size++;
    }


    // Insert at a particular index
    public void insert(int index, int value) {
        checkValidIndexForInsert(index);
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        Node previous = get(index - 1);
        Node nextNode = previous.next;
        Node newNode = new Node(value, previous, nextNode);
        previous.next = newNode;
        nextNode.previous = newNode;
        size++;
    }

    // Delete at first index
    public int deleteFirst() {
        checkEmpty();
        int value = head.value;
        head = head.next;
        if (head != null) {
            head.previous = null;
        }
        size--;
        return value;
    }

    // Delete at last index
    public int deleteLast() {
        checkEmpty();
        if(size == 1) {
            return deleteFirst();
        }

        Node last = get(size - 1);
        Node secondLast = last.previous;
        int value = last.value;
        secondLast.next = null;
        size--;
        return value;
    }

    // Delete at a particular index
    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

        Node previous = get(index - 1);
        Node current = previous.next;
        Node next = current.next;
        int value = current.value;
        previous.next = next;
        next.previous = previous;
        size--;
        return value;
    }


    // Get the Node by its index
    public Node get(int index) {
        checkValidIndex(index);
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // display the linked list
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value);
            if(temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }

    // display in reverse
    public void displayReverse() {
        if(head == null) return;
        Node temp = get(size - 1);
        while(temp != null) {
            System.out.print(temp.value);
            if(temp.previous != null) System.out.print(" <- ");
            temp = temp.previous;
        }
    }


    // check if index is valid
    private boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

    //  separate validation for insert
    private void checkValidIndexForInsert(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    // Custom exception function for isValidIndex function
    private void checkValidIndex(int index) {
        if(!isValidIndex(index)) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    // check if list is empty
    private boolean isEmpty() {
        return head == null;
    }

    // Custom exception function for isEmpty function
    private void checkEmpty() {
        if(isEmpty()) {
            throw new NoSuchElementException("List is empty. you cant perform delete operation");
        }
    }

    private class Node {
        private int value;
        private Node previous;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node previous, Node next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
