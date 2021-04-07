/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izurietaxanther_q11;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class IzurietaXanther_Q11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q11
        // XANTHER IZURIETA
        //01/03/2021

        Scanner input = new Scanner(System.in);

        //PART 1----------------------------------------------------------------
        System.out.println("The addition of elements");
        System.out.println("Enter 5 elements");

        int q = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int[] a = {q, b, c, d, e};
        int add = 0;
        System.out.println(" The sume es equal to " + PrintTaxPercentage(add, q, b, c, d, e));

        //PART2-----------------------------------------------------------------
        System.out.println("Average of three elements ");
        System.out.println("Enter 3 elements");

        float ñ = input.nextInt();
        float o = input.nextInt();
        float m = input.nextInt();

        float[] h = {ñ, o, m};
        float average = 0;

        System.out.println(" The average is  " + PrintAverage(average, ñ, m, o));
        
        //PART 3----------------------------------------------------------------
        System.out.print("Enter the number to search ");
        int[] v = {12, 23, 34, 98, 87, 65, 0};
        int find;       
        find = input.nextInt();
        findNumber(v, find);

    }

    //-------------------------------------------------------------------------
    //FUNCTIONS
    //FUNCTION 1
    public static int PrintTaxPercentage(int add, int q, int b, int c, int d, int e) {
        int[] a = {q, b, c, d, e,};
        for (int i = 0; i < a.length; i++) {
            add += a[i];
        }
        return add;
    }

    //FUNCTION 2
    public static float PrintAverage(float average, float ñ, float m, float o) {
        float[] b = {ñ, o, m};
        for (int i = 0; i < b.length; i++) {
            average += (b[i] / 3);
        }
        return (float) average;
    }
    //FUNCTION 3
    private static void findNumber(int[] v, int find) {
        for (int i = 0; i < v.length; i++) {
            if (find == v[i]) {
                System.out.println("The number " + v[i] + " has been found ");
                
            }
        }
    }
}

        
    
