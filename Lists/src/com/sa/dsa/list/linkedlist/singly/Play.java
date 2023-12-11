package com.sa.dsa.list.linkedlist.singly;

public class Play {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.printList();
        linkedList.appendLast(2);
        linkedList.printList();
        linkedList.removeLast();
        linkedList.printList();
        linkedList.prepend(0);
        linkedList.printList();
        linkedList.removeFirst();
        linkedList.printList();
    }
}
