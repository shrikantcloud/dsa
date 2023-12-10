package com.sa.dsa.arrays.onedim;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperations {

    // Create
    public int[] create() {
        System.out.println("Creating 1D Array... ");
        int[] newArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Integer Array Created of Size = " + newArr.length);
        return newArr;
    }

    // Read
    public void read(int[] inputArr) {
        System.out.println("Reading Array...");
        System.out.println("Input Array:"+Arrays.toString(inputArr)+", Size:"+ inputArr.length);
    }

    // Update
    public void update(int[] inputArr, int position, int num){
        System.out.println("Updating array = updating number on a given position");
        if (position > inputArr.length){
            throw new IllegalArgumentException("Invalid Position!!");
        }
        inputArr[position] = num;
        System.out.println("Array updated!");
        read(inputArr);
    }

    public void delete(int[] inputArr, int position){
        System.out.println("Deleting by Position of element...");
        if (position > inputArr.length){
            throw new IllegalArgumentException("Invalid Position!!");
        }
        int[] modifiedArr =  IntStream.range(0, inputArr.length)
                .filter(i -> i!= position)
                .map( i -> inputArr[i])
                .toArray();
        System.out.println("Element Deleted from position:"+position);
        read(modifiedArr);
    }

    // Driver
    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();
        int[] sample1DArr = obj.create();
        obj.read(sample1DArr);
        obj.update(sample1DArr, 5, 55);
        obj.delete(sample1DArr, 5);
        obj.delete(sample1DArr, 5);
    }

}
