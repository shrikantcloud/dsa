package com.sa.dsa.list.arraylist;

public class Play {

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        //Add elements in custom ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        //Display custom ArrayList
        list.display();
        System.out.println("\nelement at index in custom ArrayList - " + 1 + " = " + list.get(1));

        //Remove element from custom ArrayList
        System.out.println("element removed from index " + 1 + " = "
                + list.remove(1));

        //Again display custom ArrayList
        System.out
                .println("\n Display List : ");

        list.display();

        //list.remove(11); //will throw IndexOutOfBoundsException, because
        // there is no element to remove on index 11.
        // list.get(11); //will throw IndexOutOfBoundsException, because there
        // is no element to get on index 11.

        // Create ArrayList with custom capacity
        CustomArrayList<String> customArrayList = new CustomArrayList<>(99);
        System.out.println("\n Size of Custom array list = " + customArrayList.size());
    }

}
