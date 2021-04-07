/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixdeclaration;

import ec.edu.espe.matrix.MatrixOperations;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MatrixDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float[][] Matrices_A;
        float[][] Matrices_B;
        float[][] Matrices_C;
        float[][] t;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimesions");

        System.out.println("Insert the number of rows");
        m = input.nextInt();

        System.out.println("Insert the number of columns");
        n = input.nextInt();

        Matrices_A = new float[m][n];
        Matrices_B = new float[m][n];
        Matrices_C = new float[m][n];

        t = new float[n][m];

        System.out.println("------Enter the elements of the matrix-------");

        Matrices_A = MatrixOperations.readMatrixElements(m, n, "Matrices A", input);
        Matrices_B = MatrixOperations.readMatrixElements(m, n, "Matrices B", input);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.print("-- Matrices A --");
        MatrixOperations.prettyPrintMatrix(m, n, Matrices_A);
        System.out.println("");

        System.out.println("-- Matrices B --");
        MatrixOperations.prettyPrintMatrix(m, n, Matrices_B);

        MatrixOperations.transpose(n, m, t, Matrices_A);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.print("\t");

        }

        System.out.println("");
        System.out.println("-- The sum of matrices is --");

        Matrices_C = MatrixOperations.sumTwoMatrices(m, n, Matrices_A, Matrices_B);

        MatrixOperations.prettyPrintMatrix(m, n, Matrices_C);

        System.out.println("");
        System.out.println("-- The subtraction of matrices is --");

        Matrices_C = MatrixOperations.subtractionTwoMatrices(m, n, Matrices_A, Matrices_B);

        MatrixOperations.prettyPrintMatrix(m, n, Matrices_C);

        System.out.println("");
        System.out.println("-- The multiplication of matrices is --");

        Matrices_C = MatrixOperations.multiplyTwoMatrices(m, n, Matrices_A, Matrices_B);

        MatrixOperations.prettyPrintMatrix(m, n, Matrices_C);

        System.out.println("");
        System.out.println("-- The division of matrices is --");

        Matrices_C = MatrixOperations.divideTwoMatrices(m, n, Matrices_A, Matrices_B);

        MatrixOperations.prettyPrintMatrix(m, n, Matrices_C);

    }

}
