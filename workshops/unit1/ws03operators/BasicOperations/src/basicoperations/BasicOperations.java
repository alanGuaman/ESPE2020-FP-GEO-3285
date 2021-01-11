/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Personal
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiply;
        int factor1;
        int factor2;
        
        int division;
        int dividendo; 
        int divisor;
       
        
        minuend = -23;
        subtrahend = -6;
        
        //-23 -(-6)= -23 + 6 = -17
                
        //initillization
        addend1 = 5;
        addend2 = 18;
        
        factor1 =2;
        factor2 =3;
                
        dividendo = 20; 
        divisor = 5;        
        //operation
        sum = addend1 + addend2;
        System.out.println("The addtion of " + addend1 + " + " +addend2 +
                " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is aquel to -->" + sum);
                
        sum++;
        System.out.println("sum is aquel to -->" + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum " + (++sum));
        
        
        System.out.println("the subtraction of " + minuend + " - " + subtrahend +
                " is equal to " + (minuend - subtrahend));
        
         //operation
         
        multiply = factor1 * factor2;
        System.out.println("the multiplication of " + factor1 + " * " + factor2 +
                " is equal to  " + (factor1 * factor2));
        
        
        //operation
         division = dividendo / divisor;
        System.out.println("the division of " + dividendo + " / " + divisor +
                " is equal to  " + (dividendo /divisor ));
    }
    
}
