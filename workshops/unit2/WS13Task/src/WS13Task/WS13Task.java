/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS13Task;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        float perimeto = 0.0F;
        float apothem = 0.0F;
        float Diagonal = 0.0F;
        float diagonal = 0.0F;
        float area;
        float speed;
        float weather;
        float distance;

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int elección;

        System.out.println("");
        elección = input.nextInt();

        switch (elección) {

            case 1:

                do {
                    System.out.println("Choose which option you want to study");
                    System.out.println("Please Choose the Number -> ");
                    System.out.println("1. ==> Calculate areas of geometric figures (hexagono,pentagon and diamond) ");
                    System.out.println("2. ==> Calculator formula of ​​a Uniform Line Movement ");
                    System.out.println("0. ==> Exit ");
                    elección = input.nextInt();

                    switch (elección) {

                        case 1:
                            do {

                                System.out.println(" ========= Calculator area =======");
                                System.out.println("1. -> The area of ​​a hexagono");
                                System.out.println("2. -> The area of ​​a pentagon");
                                System.out.println("3. -> The area of ​​a diamond");
                                System.out.println("4. -> Exit");

                                System.out.println("Enter your menu elección --> ");
                                elección = input.nextInt();

                                switch (elección) {

                                    case 1:
                                        calculateTheHexagono(input);
                                        break;
                                    case 2:
                                        calculateThePentagon(input);
                                        break;
                                    case 3:
                                        calculateTheDiamond(input);
                                        break;
                                    case 4:
                                        System.out.println("Areas of geometric figures");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option\n\n\n");
                                        break;
                                }
                            } while (elección != 4);

                        case 2:
                            do {
                                System.out.println(" ====== Calculate physics formulas ========");
                                System.out.println("1. -> The formula of ​​a distance");
                                System.out.println("2. -> The formula of ​​a speed");
                                System.out.println("3. -> The formula of ​​a weather");
                                System.out.println("4. -> Exit");

                                System.out.println("Enter your menu elección --> ");
                                elección = input.nextInt();

                                switch (elección) {

                                    case 1:
                                        calculateTheDistance(input);
                                        break;
                                    case 2:
                                        calculateTheSpeed(input);
                                        break;
                                    case 3:
                                        calculateTheWeather(input);
                                        break;
                                    case 4:
                                        System.out.println("calculation of the formulas of ​​a Uniform Line Movement");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option\n\n\n");
                                        break;
                                }
                            } while (elección != 4);

                        case 0:
                            System.out.println("Thanks for using our Aplication ");
                            System.out.println("Good Luck");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option \n");
                            break;
                    }
                } while (elección != 2);
        }
    }

    private static void calculateTheHexagono(Scanner input) {
        System.out.println("Enter hexagono value");
        float perimeto = 0.0F;
        float apothem = 0.0F;
        float area;
        System.out.println("enter perimeto -> ");
        perimeto = input.nextInt();
        System.out.println("enter apothem -> ");
        apothem = input.nextInt();
        area = perimeto * apothem / 2;
        System.out.println("The area of ​​a circle is:" + area);
    }

    private static void calculateThePentagon(Scanner input) {
        System.out.println("The area of ​​a pentagon");
        float perimeto;
        float apothem;
        float area;
        System.out.println("enter perimetro -> ");
        perimeto = input.nextInt();
        System.out.println("enter apothem -> ");
        apothem = input.nextInt();
        area = (perimeto * apothem / 2);
        System.out.println("The area of ​​a pentagon is:" + area);
    }

    private static void calculateTheDiamond(Scanner input) {
        System.out.println("The area of ​​a diamond");
        float Diagonal;
        float diagonal;
        float area;
        System.out.println("enter Diagonal -> ");
        Diagonal = input.nextInt();
        System.out.println("enter diagonal -> ");
        diagonal = input.nextInt();
        area = (Diagonal * diagonal / 2);
        System.out.println("The area of ​​a pentagon is:" + area);
    }

    private static void calculateTheDistance(Scanner input) {
        System.out.println("Enter distance distance");
        float speed = 0.0F;
        float weather = 0.0F;
        float distance;
        System.out.println("enter speed -> ");
        speed = input.nextInt();
        System.out.println("enter weather -> ");
        weather = input.nextInt();
        distance = speed * weather / 2;
        System.out.println("Cormula de distance is ->:" + distance);
    }

    private static void calculateTheSpeed(Scanner input) {
        System.out.println("The area of ​​a speed");
        float distance = 0.0F;
        float weather = 0.0F;
        float speed;
        System.out.println("enter distance -> ");
        distance = input.nextInt();
        System.out.println("enter weather -> ");
        weather = input.nextInt();
        speed = (distance / weather);
        System.out.println("Cormula de speed is ->:" + speed);
    }

    private static void calculateTheWeather(Scanner input) {
        System.out.println("The area of ​​a weather");
        float distance = 0.0F;
        float speed = 0.0F;
        float weather;
        System.out.println("enter distance -> ");
        distance = input.nextInt();
        System.out.println("enter speed -> ");
        speed = input.nextInt();
        weather = (distance / speed);
        System.out.println("Cormula de weather is -> :" + weather);
    }
}
