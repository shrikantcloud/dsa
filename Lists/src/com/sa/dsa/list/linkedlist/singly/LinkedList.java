package com.sa.dsa.list.linkedlist.singly;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(Object data) {
        System.out.println("Initializing LinkedList with Single Node");
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Read
    public void printList() {
        System.out.println("Printing LinkedList...");
        Node temp = head;
        while (temp != null) {
            System.out.println("List value:" + temp.data);
            temp = temp.nextNode;
        }
        getLength();
    }

    public void printList(Node inputNode) {
        System.out.println("Printing LinkedList...");
        Node temp = inputNode;
        while (temp != null) {
            System.out.println("List value:" + temp.data);
            temp = temp.nextNode;
        }
        getLength();
    }

    public void appendLast(Object inputData) {
        System.out.println("Appending one Node at last in LinkedList...");
        Node newNode = new Node(inputData);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        System.out.println("Removing one Node from last in LinkedList...");
        if (length == 0) {
            return null;
        }
        Node pre = head;
        Node temp = head;
        while (temp.nextNode != null) {
            pre = temp;
            temp = temp.nextNode;
        }
        tail = pre;
        tail.nextNode = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(Object data) {
        System.out.println("Prepending one Node in the begining of LinkedList...");
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
            length++;
        }
    }

    public void removeFirst() {
        if (length == 0) {
            return;
        } else {
            Node temp = head;
            head = head.nextNode;
            temp.nextNode = null;
            temp = null;
            length--;
            if (length == 0) {
                tail = null;
            }
        }
    }

    public Node getNodeAtIndex(int index){
        System.out.println("Getting Node at Index = "+index);
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i<index; i++){
            temp = temp.nextNode;
        }
        return temp;
    }

    public boolean setValueOfNodeAtIndex(int index, Object inputData){
        System.out.println("Set value of Node at given index = "+index);
        Node temp = getNodeAtIndex(index);
        if (temp!=null){
            temp.data = inputData;
            return true;
        }
        return false;
    }

    public boolean insertNodeAtParticularIndex(int index, int inputData){
        System.out.println("Insert Node at given Index ");
        if (index < 0 || index >= length){
            return false;
        }
        if (index ==0){
            prepend(inputData);
            return true;
        }
        if (index == length){
            appendLast(inputData);
            return true;
        }
        Node newNode = new Node(inputData);
        Node temp = getNodeAtIndex(index-1);
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
        length++;
        return true;
    }

    public void getHead() {
        System.out.println("Head: " + head.data);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.data);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
