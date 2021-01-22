/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author Personal
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int  i;
           i = 0;

        System.out.println("==== This is a whilw loop from 1 to 20 ====");
        
        
        while( i < 21 ){
            System.out.println("i -->" + i );
            //i + -1;
	    i++;
            //i - i + 1;    
        }
        
        System.out.println("Multiplication Tables : 12");
        int top=20;
        int product = 0;
        int table = 20;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("20 * " + j + " = " + product);
        }
        
        System.out.println("downward collation Tables : 20 to 1");
        
        int stop;
        stop=20;
            
        for (int j =1  ; j < top; j+=1 ){
            
          System.out.println( j); 
       
       
        }
    }
}
       

