/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
        int matrixC[][] = new int[3][3];
        int i, j;

        Scanner dato = new Scanner(System.in);

        System.out.print("Enter the matrix A :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Enter of  the value " + i + " , " + j + " : ");
                matrixA[i][j] = dato.nextInt();
            }
        }

        System.out.print("Enter of the matrix B :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Enter of the value " + i + " , " + j + " : ");
                matrixB[i][j] = dato.nextInt();
            }
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.print("The result of matrix substraction is");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println("");

        
    
        }
    }
}    
