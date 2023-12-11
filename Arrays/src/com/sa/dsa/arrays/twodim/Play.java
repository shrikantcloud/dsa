package com.sa.dsa.arrays.twodim;

public class Play {

    public static void main(String[] args) {
        TwoDArrayOperations obj = new TwoDArrayOperations();
        int[][] matrix = obj.create();
        obj.update(matrix, 2, 3, 99);
        obj.delete(matrix, 5, 5, 99);
        obj.search(matrix, 5, 5, 0);
        obj.search(matrix, 5, 5, 99);

    }
}
