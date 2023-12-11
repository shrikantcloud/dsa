package com.sa.dsa.arrays.onedim;

public class Play {

    // Driver
    public static void main(String[] args) {
        OneDArrayOperations obj = new OneDArrayOperations();
        int[] sample1DArr = obj.create();
        obj.read(sample1DArr);
        obj.update(sample1DArr, 5, 55);
        obj.delete(sample1DArr, 5);
        obj.delete(sample1DArr, 5);
        obj.search(sample1DArr, 7);
    }
}
