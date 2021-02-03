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
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option = 0;
        
        do {
            System.out.println(" ========= Calculator  multiplication table =======");
            System.out.println("1. -> multiplication table: 1 ");
            System.out.println("2. -> multiplication table: 2");
            System.out.println("3. -> multiplication table: 3");
            System.out.println("4. -> multiplication table: 4");
            System.out.println("5. -> multiplication table: 5");
            System.out.println("6. -> multiplication table: 6");
            System.out.println("7. -> multiplication table: 7");
            System.out.println("8. -> multiplication table: 8");
            System.out.println("9. -> multiplication table: 9");
            System.out.println("10. -> multiplication table: 10");
            System.out.println("11. -> multiplication table: 11");
            System.out.println("12. -> multiplication table: 12");
            System.out.println("0. -> Exit");
            
            System.out.println("Enter your menu option-->");
            option = input.nextInt();
            
            switch(option){    
                 
                case 1 :
                    System.out.println("multiplication table");
                    int top=12;
                    int product=0;
                    int t;
                    t = input.nextInt();
                    for(int j=1 ; j<=top ; j++){
                    product = t * j;
                    System.out.println(t + "*" + j + " = " + product);
                    }
                    break;
                 
                case 0 :
                    System.out.println("Good Bye my friend ");
                    System.exit(0);
                    break;
            default :
                System.out.println("invalid option\n\n");
                break;
                    
            }
        } while ( option !=0);
        
    }
    
    }
    

    