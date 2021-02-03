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
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int elección;

        do {

            System.out.println(" ========= The factorial of a number =======");
            System.out.println("Note that if you insert a number less than 1 or greater than 15 it will not give you a result");
            System.out.println("1. Enter the factorial number you want to study:");
            System.out.println("2. -> Exit");

            System.out.println("Enter your menu elección --> ");
            elección = input.nextInt();

            switch (elección) {

                case 1:
                    int factorial;
                    int stop;
                    int number;                 

                    factorial = 1;
                    stop = 15;

                    System.out.println("Insert the factorial number ---> ");
                    number = input.nextInt();
                    for (int j = number; j > 0; j--) 
                    factorial = factorial * j;
                    System.out.println("the factorial of the number -->" + number + " = " + factorial);
                    break;
                case 2:
                    System.out.println("Until next time");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (elección != 2);
    }   
}

