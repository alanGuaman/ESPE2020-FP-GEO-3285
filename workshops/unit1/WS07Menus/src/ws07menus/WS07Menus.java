/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial;
        int stop;
        int number;
        
        factorial =1;
        stop =15;


        do {
            System.out.println("Enter the factorial number you want to study:");
            System.out.println("Note that if you insert a number less than 1 or greater than 15 it will not give you a result");
            System.out.println(" 0 to exit  --> ");

            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            
            if (factorial != 0) {
                System.out.println("Studying the factorial number ---> " + factorial + " <----");
                for (int i= number;  i > 1; i--) {
                    stop =15;
                    factorial = factorial * i ;
                    System.out.println("the factorial of the number -->" + number + " = " + factorial );
                    break;
                }
            }

        } while (factorial != 0);

        System.out.println("Good bye");

    }
    
}

