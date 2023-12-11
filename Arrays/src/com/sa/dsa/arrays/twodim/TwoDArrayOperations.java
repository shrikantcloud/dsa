package com.sa.dsa.arrays.twodim;

public class TwoDArrayOperations {


    //Create
    public int[][] create() {
        System.out.println("Creating Matrix ...");
        int row = 5;
        int col = 5;
        int[][] matrix = new int[row][col];
        int count = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = count++;
            }
        }
        display(matrix);
        return matrix;
    }

    // Update
    public void update(int[][] matrix, int rowToUpdate, int colToUpdate, int newElement) {
        System.out.println("Updating Element in Matrix ...");
        matrix[rowToUpdate][colToUpdate] = newElement;
        display(matrix);
    }

    // Read
    public void display(int[][] matrix) {
        System.out.println("Printing Matrix ...");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Delete (Soft - Mark to 0)
    public void delete(int[][] matrix, int row, int col, int elementToDelete) {
        System.out.println("Deleting Element from Matrix ...");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == elementToDelete) {
                    matrix[i][j] = 0;
                }
            }
        }
        display(matrix);
    }

    // Search
    public void search(int[][] matrix, int row, int col, int elementToSearch) {
        System.out.println("Searching Matrix ...");
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == elementToSearch) {
                    System.out.println("Element " + elementToSearch + " found in row, column : " + i + "," + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element " + elementToSearch + " not found");
        }
    }

}
