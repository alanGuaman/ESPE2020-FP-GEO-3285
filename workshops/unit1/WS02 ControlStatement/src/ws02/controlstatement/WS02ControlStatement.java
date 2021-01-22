/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws02.controlstatement;

/**
 *
 * @author Personal
 */
public class WS02ControlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Please enter an integer --");
        
        int num;
        
        num = 20 * 50;
        
        if (num % 20 == 0) {
            System.out.println("      The number entered is even--  " + num
            );
        } else {
            System.out.println("   The number entered is odd--" + num);
        }
    }
    
}
