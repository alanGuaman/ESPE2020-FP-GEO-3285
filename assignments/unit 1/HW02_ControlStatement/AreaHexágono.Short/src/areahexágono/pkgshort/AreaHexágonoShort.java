/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areahexágono.pkgshort;

/**
 *
 * @author Personal
 */
public class AreaHexágonoShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        short length;
        short apothem;
        short area;
        
        length = 7;
        apothem = 3;
             
        
        area = (short) (7*apothem*length/2 ) ;
        
        System.out.println("the area " + length + "is aquel to--" + area );
    }
    
    
}
