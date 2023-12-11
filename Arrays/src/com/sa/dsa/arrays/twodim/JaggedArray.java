package com.sa.dsa.arrays.twodim;

/*
Array with unequal columns and Rows
 */
public class JaggedArray {

    public static void main(String[] args) {
        int row = 5;
        int[][] jarr = new int[5][];

        for (int i = 0; i < jarr.length; i++) {
            jarr[i] = new int[i + 1];
        }
        int count = 1;
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                jarr[i][j] = count++;
            }

        }

        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                System.out.print(jarr[i][j] + " ");
            }

            System.out.println();
        }
    }
}

