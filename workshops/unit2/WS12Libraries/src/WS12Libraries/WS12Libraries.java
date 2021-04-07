/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS12Libraries;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power=0.0F;
        float base=0.0F;
        float exponent=0.0F;
        float absoluteValue=0.0F;
              
        
       number=10;
       squareRoot=(float)Math.sqrt(number);
        System.out.println("the square root of--" +number+ "-is-" + squareRoot );
       
       number=50;
       number=5;
       power=(float)Math.exp(number);
       System.out.println("the exponet--" +number+ "-is-" + power );
       
        base=9;
        exponent=3;
        power = (float)Math.pow(base, exponent);
        System.out.println(base+ " ^ "+ exponent + "=" + power);
        
        base=7;
        exponent=4;
        power = (float)Math.pow(base, exponent);
        System.out.println(base+ " ^ "+ exponent + "=" + power);
        
        base=98;
        exponent=3;
        
        
        absoluteValue = getAbsoluteValue(number);
        number = -20;
        absoluteValue = getAbsoluteValue(number);
                System.out.println("the absolutevalue of " + number + " is " + absoluteValue);
                
                number = 20;
        absoluteValue = getAbsoluteValue(number);
                System.out.println("the absolutevalue of " + number + " is " + absoluteValue);

        //calculator 
    }
    public static float computePower(float base, float exponent){
        float power;
        power =0.0F;
        
        for (int i = 1; i <= (int)exponent ; i ++){
            power = power * base;
        }
        return power;
    }
    public static float getAbsoluteValue(float number){
        if (number < 0){
            return -number;
            
        }else{
            return number;
        }
//        if(number < 0);
//        number = number * -1;
//    return number;
//    }
//    return number;
    
}

       
        
    Scanner data = new Scanner(System.in);
    double value1;
    double value2;
    double value3;
    double rentalValue;
    double ivaTax;
    double feTax;

    public void enterData() {
        System.out.println("Enter the value of your income in the year: ");
        value1 = data.nextDouble();
    }

    public void showIncomeTax() {
        if (value1 > 0 && value1 <= 11212) {
            System.out.println("The tax on the basic fraction is $ 0");
            System.out.println("The tax on the excess fraction is $ 0");
        } else if (value1 > 11212 && value1 <= 14285) {
            rentalValue = value1 * 0.05;
            System.out.println("The tax on the basic fraction is $ 0");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 14285 && value1 <= 17854) {
            rentalValue = value1 * 0.10;
            System.out.println("The tax on the basic fraction is $ 154");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 17854 &&value1 <= 21442) {
            rentalValue = value1 * 0.12;
            System.out.println("The tax on the basic fraction is $ 511");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 21442 &&value1 <= 42874) {
            rentalValue = value1 * 0.15;
            System.out.println("The tax on the basic fraction is $ 941");
            System.out.println("The tax on the excess fraction is $" + rentalValue);
        } else if (value1 > 42874 && value1 <= 64297) {
            rentalValue = value1 * 0.20;
            System.out.println("The tax on the basic fraction is $ 4 156");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 64297 && value1 <= 85729) {
            rentalValue = value1 * 0.25;
            System.out.println("The tax on the basic fraction is $ 8 440");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 85729 && value1 <= 114288) {
            rentalValue = value1 * 0.30;
            System.out.println("The tax on the basic fraction is $ 13 798");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 114288) {
            rentalValue = value1 * 0.35;
            System.out.println("The tax on the basic fraction is $ 22 366");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        }

    }

    public void enterDataIVA() {
        System.out.println("Enter the value of the service or product: ");
        value2 = data.nextDouble();
    }

    public void showIVA() {
        ivaTax = value2 * 0.12;
        System.out.println("The IVA is: " + ivaTax);
        System.out.println("TOTAL --> " +value2+ " + " + ivaTax + " = " + (value2 + ivaTax));
    }

    public void enterDataForeignExchange() {
        System.out.println("Enter the value to send: ");
        value3 = data.nextDouble();
    }

    public void showForeignExchangeTax() {
        feTax = value3 * 0.05;
        System.out.println("The  amount to pay of the tax on the exit of foreign "
                + "currency is: " + feTax);
    }
}