/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guamanalan.examunit1;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class GuamanAlanExamUnit1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int factor1=1;factor1<12;factor1++){
             System.out.println(" ========= Multiplication table of the "+factor1+" =======");
             for(int factor2 =1; factor2 <=12; factor2++) {
                System.out.println(factor1 + "*" + factor2+"=" + (factor1*factor2));

             }
             System.out.println("=");
      
        }
    }
}

        

        