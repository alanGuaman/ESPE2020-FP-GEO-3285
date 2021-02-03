/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areahexagono.pkgint;

/**
 *
 * @author Personal
 */
public class AreaHexagonoInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int length;
        int apothem;
        int area;
        
        length = 7;
        apothem = 3;
             
        
        area = (int) (7*apothem*length/2 ) ;
        
        System.out.println("the area " + 5 + "*" + length + "*" + apothem + "/" + 2 + "is aquel to--" + area );
        
    }
    
}
