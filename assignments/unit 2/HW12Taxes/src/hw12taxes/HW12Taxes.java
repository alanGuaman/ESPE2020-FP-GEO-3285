/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float amount;
        float quantity ;
        float total= 0.0F;
        float base;
        float exponent;
        float absoluteValue;
        float tax= 0.0F;
        float iva= 1.12F;
        float option=0.0F ;
        
        System.out.println("==========================");
        System.out.println(" Welcome To The Program  "); 
        System.out.println("==========================");

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the quantity of the product -->" );
        quantity = input.nextInt();
        total = calculationOfIva(quantity, iva);
        System.out.println("include iva is" + total);
        
        System.out.print("Insert the fractional number ->");
        quantity = input.nextInt();
        total = computeIncomeTax(quantity, tax);
        System.out.println("the total include the income tax ->"+ total);
        
        System.out.print("Insert the amount ->");
        quantity=input.nextInt();
        total = slackCalculation(quantity, tax, option);
        System.out.println("The total include Exchange tax ->"+ total);

}

public static float calculationOfIva(float quantity, float iva) {
    float total;
    
    {
	total = quantity * iva;
        
	return total;
    }
}

public static float computeIncomeTax(float quantity, float tax) {
    float total = 0.0F;
	
	if (quantity > 0 && quantity < 11212) {
	    tax = 1.00F;
		total = quantity * tax;
		return total;
                
        } else if (quantity >= 11212 && quantity < 14285) {
	    tax = 1.05F;
            total = quantity * tax;
	    return  total;
            
	} else if (quantity >= 14285 && quantity < 17854) {
	    tax = 1.10f;
		total = quantity * tax;
		return total;
                
	} else if (quantity >= 17854 && quantity < 21442) {
	    tax = 1.12f;
		total = quantity * tax;
		return total;
                
	} else if (quantity >= 21442 && quantity < 42874) {
	    tax = 1.15f;
		total = quantity * tax;
		return total;
                
	} else if (quantity >= 42874 && quantity < 64297) {
	    tax = 1.20f;
		total = quantity * tax;
		return total;
                
	} else if (quantity >= 64297 && quantity < 85729) {
	    tax = 1.25f;
		total = quantity * tax;
		return total;
                
	} else if (quantity >= 85729 && quantity < 114288) {
	    tax = 1.30f;
		total = quantity * tax;
		return total;
	} else if (quantity >= 114288) {
	    tax = 1.35f;
		total = quantity * tax;
		return total;
	}
	return total;
}

public static float slackCalculation(float price, float tax, float option) {
        float total = 0.0F;
        System.out.print("Enter the kind of pay");
        System.out.print("Option one");
        System.out.print("I pay with credit card ");
        System.out.print("Option two");
        System.out.print("Online payments ");
        Scanner scanner = new Scanner(System.in);
        option = (float) scanner.nextInt();
        scanner.nextLine();
        
            

            if (option <= 1 && price >= 5000) {
                tax = 1.05F;
                total = price * tax;
                return total;
            } else if (option <= 1 && price < 5000){
                tax = 1.00F;
            total = price * tax;
            return total;}

            else if (option >= 2 && price >= 100) {
                tax = 1.05F;
                total = price * tax;
                return total;
            }else
                tax=1.00F;
            total = price * tax;
                return total;

        }

}


