/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05.factorialnumber;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class HW05FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        
        int factorial;
        int stop;
        int number;
        
        factorial =1;
        stop =15;


        do {
            System.out.println("1. Enter the factorial number you want to study:");
            System.out.println("Note that if you insert a number less than 1 or greater than 15 it will not give you a result");
            System.out.println("2. 0 to exit  --> ");

            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            
            if (factorial != 0) {
                System.out.println("Studying the factorial number ---> ");
                for (int i= number;  i > 0; i--) {
                    factorial = factorial * i ;
                    System.out.println("the factorial of the number -->" + number + " = " + factorial );
                }
            }
            

        } while (factorial != 0);

        System.out.println("Good bye");

    }
    
}

