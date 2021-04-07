/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15.correctionexam;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class WS15CorrectionExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int animalsWithWeights = 0;
        String[] animal;
        float[] Weight;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Plase Enter the  amount of players you want to record ->");
        animalsWithWeights = scanner.nextInt();

        animal= new String [animalsWithWeights];
        Weight = new float[animalsWithWeights];

        for (int i = 0; i < animalsWithWeights; i++) {
            scanner.nextLine();
            System.out.print("Plase Enter the name of animal #" + i + "->");
            animal[i] = scanner.nextLine();
            System.out.print("Plase enter  " + animal[i] + " Weight");
            Weight[i] = scanner.nextFloat();
        }

        
    }
    
}
