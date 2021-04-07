/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16.matrixfuncitions;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class HW16MatrixFuncitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float[][] Matrices_A;
        float[][] Matrices_B;
        float[][] t;
        float[][] Matrices_C;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimesions");

        System.out.println("Insert the number of rows");
        System.out.print("m -> ");
        m = input.nextInt();

        System.out.print("n -> ");
        n = input.nextInt();

        Matrices_A = new float[m][n];
        Matrices_B = new float[m][n];
        Matrices_C = new float[m][n];

        t = new float[n][m];

        System.out.println("------Enter the elements of the matrix-------");

        Matrices_A = readMatrixElements(m, n, "Matrices A", input);
        Matrices_B = readMatrixElements(m, n, "Matrices B", input);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.print("-- Matrices A --");

        prettyPrintMatrix(m, n, Matrices_A);
        System.out.println("");

        System.out.println("-- Matrices B --");
        prettyPrintMatrix(m, n, Matrices_B);

        transpose(n, m, t, Matrices_A);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.print("\t");

        }

        System.out.println("");
        System.out.println("-- The subtraction of matrices is --");

        Matrices_C = addTwoMatrices(m, n, Matrices_A, Matrices_B);

        prettyPrintMatrix(m, n, Matrices_C);

    }

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

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
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
