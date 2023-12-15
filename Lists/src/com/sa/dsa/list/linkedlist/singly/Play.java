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
        linkedList.appendLast(2);
        linkedList.appendLast(3);
        linkedList.appendLast(4);
        linkedList.appendLast(5);
        linkedList.printList();

        System.out.println("Node valie at index = " + linkedList.getNodeAtIndex(2).data);
        linkedList.setValueOfNodeAtIndex(2, 99);
        linkedList.printList();
        linkedList.insertNodeAtParticularIndex(3, 98);
        linkedList.printList();
        linkedList.removeNodeAtParticularIndex(4);
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();
        Node middle = linkedList.findMiddle();
        System.out.println("Middle Node data = " + middle.data);
        System.out.println("has Cycle:" + linkedList.hasCycle());
    }
}
