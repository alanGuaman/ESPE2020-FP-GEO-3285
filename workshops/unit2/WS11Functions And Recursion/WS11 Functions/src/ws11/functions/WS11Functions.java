/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.functions;

/**
 *
 * @author Personal
 */
public class WS11Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Alan Guaman ====");

        int number = 20;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }

}