/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws03.operators;

/**
 *
 * @author Personal
 */
public class WS03Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        minuend = -20;
        subtrahend = -6;
        
        //-20 - (-6) = -20 + 6 = -17
        //initilization
        addend1 = 5;
        addend2 = 18;
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + 
                " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("ading one to sum " + ((++sum)));
        
        System.out.println("the subtraction of " + minuend + " - " + subtrahend + 
                " is equal to " + (minuend - subtrahend));
    }
}

