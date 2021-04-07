/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] shoeBrands;
        String[] chickens = {"Nike", "Adidas", "Reebok", "Puma", "Converse"};
        float[] salesPerYear = {10.2F, 8.4F, 4.2F, 7.1F, 6.3F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops -> ");
        n = input.nextInt();

        shoeBrands = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of shoes " + (i + 1) + " -> ");
            shoeBrands[i] = input.nextInt();
        }
        System.out.println(" ============================================");

        for (int shoe : shoeBrands) {
            System.out.println("shoe of Brands are " + shoe);
        }
        System.out.println(" ============================================");

        for (int i = 0; i < n; i++) {
            System.out.println("shoe of Brands " + (i + 1) + " -> " + shoeBrands[i]);
        }
        System.out.println(" ============================================");

        for (String Brands : chickens) {
            System.out.println("shoe of Brands name -> " + Brands);
        }
        System.out.println(" ============================================");

        for (int i = 0; i < salesPerYear.length; i++) {
            System.out.println("sales of Year" + (i + 1) + " -> " + salesPerYear[i]);
        }

    }

}
