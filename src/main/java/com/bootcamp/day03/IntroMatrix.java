package com.bootcamp.day03;

import java.util.Random;

public class IntroMatrix {
    public static void main(String[] args) {
        printMatrix(fillMatrix(5));
        System.out.println();
        printMatrix(fillMatrixRandom(5));
        System.out.println();
        printMatrix(matrixDiagonalA(5));
    }

    static int[][] matrixDiagonalA(final int n){
        int[][] matrix = new int[5][5];
        
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                
                if(row == col)
                    matrix[row][col] = row+1;
                
                if(col > row)
                    matrix[row][col] =10;
                
                if (row > col)
                    matrix[row][col]=20;

            }
        }

        return matrix;
    }

    static void initMatrix() {
        int[][] matrix = new int[3][2];
        matrix[0][1] = 3;

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 2, 3, 4 },
                { 4, 5, 6 }
        };
    }

    static int[][] fillMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = row + col;
            }
        }

        return matrix;
    }

    static int[][] fillMatrixRandom(int n) {
        int[][] matrix = new int[n][n];

        Random random = new Random();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = random.nextInt(11);
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%3s", matrix[row][col]);
            }
            System.out.println();
        }
    }

}
