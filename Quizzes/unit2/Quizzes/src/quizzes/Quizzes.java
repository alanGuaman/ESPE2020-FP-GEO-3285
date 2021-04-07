/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Quizzes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here

        int[] animalsWithWeights;
        String[] animals = {"Cow", "Horse", "Elephant", "Lion", "Pig"};
        float[] Weight = {720.0F, 380.0F, 6000.0F, 190.0F, 50.0F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to start -> ");
        n = input.nextInt();

        animalsWithWeights = new int[n];

    
        for (String animal : animals) {
            System.out.println("animal name -> " + animal);
        }

        for (int i = 0; i < Weight.length; i++) {
            System.out.println("weight of animals " + (i + 1) + " -> " + Weight[i]);
        }
    }
}
