/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11recursion;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class WS11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("====================");  
    System.out.println("    Alan Guaman     ");    
    System.out.println("===================="); 
    
    Scanner input = new Scanner(System.in);
        int divd;
        int divisor;
        float quotient = 0;
        int variableX;
        int variableY;
        int multiplicand=0;
        int multiplier;
        int product;
        int stop= 12; 
        
    System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
    System.out.println("Welcome To The Program"); 
    System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
    
        System.out.println("insert the divd  ");
        divd =input.nextInt();
        System.out.println("insert the divr  ");
        divisor =input.nextInt();
        quotient = divideNumbers(divd, divisor);
        System.out.println("Quotient of" + divd+ " and " + divd  + " is ->" +quotient);

        
        System.out.println("==============insert a number that replaces x ============= ");
        System.out.println("x*x+2*x+1 is aqual to =>");
        variableX =input.nextInt();
        variableY=ShowMultiplication(variableX);
        System.out.println(variableY);
        
       
        System.out.println("==============insert a number that replaces x ============= ");
        System.out.println("insert a number ");
        variableX =input.nextInt();
        variableY= ComputeSquare(variableX);
        System.out.println("x^2 is aqual to =>" +variableY);

        System.out.println("Enter the table you want to study ");
        System.out.println("Studying the Table of ----> " );
  
        multiplicand=input.nextInt();
        for (multiplier = 1; multiplier <= stop; multiplier++) {
            
        product = ShowTheMultiplicationTable (multiplier, multiplicand);
  
        System.out.println(multiplicand + " x " + multiplier + " = " + product);
        }
        
        System.out.println("====================");
        System.out.println("      Good bye      ");
        System.out.println("====================");
                   
        }
    
    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideNumbers(int dividend, int divisor) { 
        //body of the function
        float quotient = 0.0f;


        quotient = (float) dividend / (float) divisor;

        return quotient;
        
       
    }
    public static int ShowMultiplication(int x) {
        System.out.println("====================");  

        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
        
    }
    
    
    

    public static int ComputeSquare(int x) {
        System.out.println("====================");

        int y = 0;

        y = x * x;

        return y;
    }

    
    public static int ShowTheMultiplicationTable(int multiplicand, int multiplier){ 
        int product=0;
        
        product=multiplicand*multiplier;
        
        return product;
        
    }

}
    