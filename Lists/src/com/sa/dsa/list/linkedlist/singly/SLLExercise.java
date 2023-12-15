package com.sa.dsa.list.linkedlist.singly;

public class SLLExercise {

    private Node headNode;
    private Node tailNode;
    private int length;

    public SLLExercise(int data) {
        Node newNode = new Node(data);
        System.out.println("Node Initialized..");
        headNode = newNode;
        tailNode = newNode;
        length = 1;
    }

    public static void main(String[] args) {
        SLLExercise testList = new SLLExercise(99);
        testList.printSLL(testList.getHeadNode());
        testList.appendAtLast(100);
        testList.printSLL(testList.getHeadNode());
        testList.removeLast();
        testList.printSLL(testList.getHeadNode());
        testList.prependAtStart(100);
        testList.printSLL(testList.getHeadNode());
        testList.removeFirst();
        testList.printSLL(testList.getHeadNode());
        testList.appendAtLast(100);
        testList.appendAtLast(101);
        testList.appendAtLast(102);
        testList.appendAtLast(103);
        testList.appendAtLast(104);
        testList.appendAtLast(105);
        testList.appendAtLast(106);
        testList.appendAtLast(107);
        testList.appendAtLast(108);
        testList.printSLL(testList.getHeadNode());
        testList.setNodeValueAtIndex(3,33);
        testList.printSLL(testList.getHeadNode());
        testList.insertNewNodeAtIndex(3,22);
        testList.printSLL(testList.getHeadNode());
        testList.removeNodeAtIndex(4);
        testList.printSLL(testList.getHeadNode());
        testList.reverse();
        testList.printSLL(testList.getHeadNode());
    }

    public void printSLL(Node inputNode) {
        Node tempNode = inputNode;
        int count = 0;
        System.out.print("Singly Linked List ==>> ");
        while (tempNode != null) {
            count++;
            System.out.print(tempNode.data + ",");
            tempNode = tempNode.nextNode;
        }
        length = count;
        System.out.println("\nLength = " + count);
    }

    public void appendAtLast(int data) {
        System.out.println("Appending at last ..");
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
    }

    public void removeLast() {
        System.out.println("Removing from last ..");
        if (getLength() == 0) {
            return;
        }
        Node previousNode = headNode;
        Node currentNode = headNode;
        while (currentNode.nextNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        tailNode = previousNode;
        tailNode.nextNode = null;
        length--;
        if (length == 0) {
            headNode = tailNode = null;
        }
    }

    public void prependAtStart(int data) {
        System.out.println("Prepending at start ..");
        if (getLength() == 0) {
            return;
        }
        Node newNode = new Node(data);
        newNode.nextNode = headNode;
        headNode = newNode;
    }

    public void removeFirst() {
        System.out.println("Removing at first..");
        if (getLength() == 0) {
            return;
        }
        Node currentNode = headNode;
        headNode = headNode.nextNode;
        currentNode.nextNode = null;
        length--;
        currentNode = null;

    }

    private Node getNodeAtIndex(int index){
        System.out.println("Fetching Node at Index = "+ index);
        int length = getLength();
        if (index < 0 || index > length){
            throw new IndexOutOfBoundsException("Out of Range !!");
        }
        Node currentNode  = headNode;
        for (int i=0;i<index;i++){
            currentNode = currentNode.nextNode;
        }
        System.out.println("Value at the index = "+ currentNode.data);
        return currentNode;
    }

    private void setNodeValueAtIndex(int index, int dataToUpdate){
        System.out.println("Setting the data of Node at Index = "+ index);
        Node nodeAtGivenIndex = getNodeAtIndex(index);
        if (nodeAtGivenIndex != null){
            nodeAtGivenIndex.data = dataToUpdate;
        }
    }

    public void insertNewNodeAtIndex(int index, int data){
        System.out.println("Insert new node at Index = "+ index);
        Node previousNodeOfIndex = getNodeAtIndex(index-1);
        Node newNode = new Node(data);
        Node currentNode = previousNodeOfIndex;
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
        length++;
    }

    public void removeNodeAtIndex(int index) {
        System.out.println("Remove node at Index = " + index);
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            removeFirst();
        }
        if (index == length - 1) {
            removeLast();
        }
        Node nodeToRemovePrevious = getNodeAtIndex(index-1);
        Node nodeToRemove = nodeToRemovePrevious.nextNode;
        nodeToRemovePrevious.nextNode = nodeToRemove.nextNode;
        length--;
    }

    public void reverse(){
        System.out.println("Reversing the list..");
        Node previousNode = null;
        Node currentNode = headNode;
        Node nextNode = null;
        while (currentNode!= null){
            nextNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        headNode = previousNode;
    }

    private Node getHeadNode() {
        return headNode;
    }

    private int getLength() {
        return length;
    }
}
