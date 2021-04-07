/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11functions;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class HW11Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Alan Guaman ====");
        
        Scanner input = new Scanner(System.in);

        int number = 0;
        int fact = 0;
         
        fact = showTheFactorial(number);
        
        System.out.println("insert the number ");
        number =input.nextInt();

        System.out.println("fact of " + number + " is equal to -> " + showTheFactorial(number));
        fact = showTheFactorial(number);
        
    }

    public static int showTheFactorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * showTheFactorial(n - 1));
            }
        }
    }

}