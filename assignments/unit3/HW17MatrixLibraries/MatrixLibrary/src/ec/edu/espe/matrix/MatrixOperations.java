/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MatrixOperations {
    
    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int n, int m, float[][] t, float[][] a) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }

    }

    public static float[][] sumTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    
    public static float[][] subtractionTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }
    
    public static float[][] multiplyTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }
    
    public static float[][] divideTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] / b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("|\t");
                    } else if (i == m - 1) {
                        System.out.print("|\t");

                    } else {
                        System.out.print("| \t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t|");
                    } else if (i == m - 1) {
                        System.out.print("\t|");

                    } else {
                        System.out.print("\t|");
                    }
                }
            }
        }
        System.out.println("");
    }

}


