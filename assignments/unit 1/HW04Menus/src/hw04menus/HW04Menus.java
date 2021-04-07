/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("  Author: Guamán Alan ");
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int elección;

        do {
            System.out.println(" ========= Calculator area =======");
            System.out.println("1. -> The area of ​​a square ");
            System.out.println("2. -> The area of ​​a hexagono");
            System.out.println("3. -> The area of ​​a rectangle");
            System.out.println("4. -> The area of ​​a pentagon");
            System.out.println("5. -> The area of ​​a diamond");
            System.out.println("6. -> Exit");

            System.out.println("Enter your menu elección --> ");
            float case2,case4,case5;
            elección = input.nextInt();

            switch (elección){
                
                case 1:
                    int L1;
                    int L2;
                    int area1;
                    System.out.println("enter L1 -> ");
                    L1 = input.nextInt();
                    System.out.println("enter L2 -> ");
                    L2 = input.nextInt();
                    area1 = (L1 * L2);
                    System.out.println(" the sum is --> " + area1);
                    break;
                case 2: 
                    System.out.println("Enter hexagono value");
                    int p;
                    int a;
                    int area2;
                    System.out.println("enter p -> ");
                    p=input.nextInt();
                    System.out.println("enter a -> ");
                    a=input.nextInt();
                    area2= (p*a/2);
                    System.out.println("The area of ​​a circle is:" +area2);
                    break;
                case 3:
                    System.out.println("Enter rectangle value");
                    int base;
                    int altura;
                    int area3;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter altura -> ");
                    altura = input.nextInt();
                    area3=(base*altura);
                    System.out.println("The area of ​​a rectangle is:" +area3);
                    break;
                case 4:
                    System.out.println("The area of ​​a pentagon");
                    int perimeto;
                    int apothem;
                    int area4;
                    System.out.println("enter perimetro -> ");
                    perimeto=input.nextInt();
                    System.out.println("enter apothem -> ");
                    apothem=input.nextInt();
                    area4=(perimeto*apothem/2);
                    System.out.println("The area of ​​a pentagon is:" +area4);
                    break;
                case 5:
                    System.out.println("The area of ​​a diamond");
                    int D;
                    int d;
                    int area5;
                    System.out.println("enter perimetro -> ");
                    D=input.nextInt();
                    System.out.println("enter apotema -> ");
                    d=input.nextInt();
                    area5=(D*d/2);
                    System.out.println("The area of ​​a pentagon is:" +area5);
                    break;
                case 6:
                    System.out.println("Areas of geometric figures");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (elección != 6);
        
    }
}
           
                
                
            
   

        