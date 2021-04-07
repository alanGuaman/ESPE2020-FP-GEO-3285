/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.recursion;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Value");
        int number1 = input.nextInt();

        System.out.println("Enter the Second Value");
        int number2 = input.nextInt();

        
        showTheDivisibleFor2(number1, number2);
                
        showTheDivisibleFor3(number1, number2);
            
        showTheDivisibleFor7(number1, number2);
            
        showTheDivisibleFor11(number1, number2);
            
        showTheDivisibleFor13(number1, number2);
    }

    private static void showTheDivisibleFor2(int number1, int number2) {
        if ( number1 % 2 == 0 )
        {
            System.out.println("The number " +number1+ " Is Divisible for 2. \n" );
            System.out.println("The number " +number2+ " Is Divisible for 2. \n");
            int multiplicand=number1;
            int multiplier=number2;
            int product;
            
            product = multiplicand * multiplier;
            System.out.println("So " +multiplicand+ "*" +multiplier+ "=" +product);
        }
    }

    private static void showTheDivisibleFor3(int number1, int number2) {
        if ( number1 % 3 == 0 )
        {
            System.out.println("The number " +number1+ " Is Divisible for 3. \n" );
            System.out.println("The number " +number2+ " Is Divisible for 3. \n");
            int addend1=number1;
            int addend2=number2;
            int sum;
            
            sum = addend1 + addend2;
            System.out.println("So " +addend1+ "+" +addend2+ "=" +sum);
        }
    }

    private static void showTheDivisibleFor7(int number1, int number2) {
        if ( number1 % 7 == 0 )
        {
            System.out.println("The number " +number1+ " Is Divisible for 7. \n" );
            System.out.println("The number " +number2+ " Is Divisible for 7. \n");
            int dividend=number1;
            int divisor=number2;
            int remainder;
            
            remainder = dividend % divisor;
            System.out.println("So " +dividend+ "%" +divisor+ "=" +remainder);
        }
    }

    private static void showTheDivisibleFor11(int number1, int number2) {
        if ( number1 % 11 == 0 )
        {
            System.out.println("The number " +number1+ " Is Divisible for 11. \n" );
            System.out.println("The number " +number2+ " Is Divisible for 11. \n");
            System.out.println("====== MULTIPLICATION : 11 ======");
        
            int top=12;
            int product=0;
            int table = 11;
            
            
            for(int j=1 ; j <= top ; j++){
                product = table * j;
                System.out.println("11 * " + j + " = " + product);
            }
        }
    }

    private static void showTheDivisibleFor13(int number1, int number2) {
        if ( number1 % 13 == 0 )
        {
            System.out.println("The number " +number1+ " Is Divisible for 13. \n" );
            System.out.println("The number " +number2+ " Is Divisible for 13. \n");
            int dividend=number1;
            int divisor=number2;
            int quotient;
            
            quotient = dividend / divisor;
            System.out.println("So " +dividend+ "/" +divisor+ "=" +quotient);
        }
    }
}
