/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        float speed;
        float weather;
        float distance;

        System.out.println("--- Author: Guamán Alan ---");
        
        System.out.println("Calculate the distance of a vehicle");

        System.out.println("enter speed");
        speed = input.nextInt();
        System.out.println("enter weather");
        weather = input.nextInt();
        distance = calculateTheDistance(speed, weather);
        System.out.println("The distance that reached the vehicle is->:" + distance + "m");

        System.out.println("--------------------------");

        System.out.println("Calculate the ​speed of a vehicle");
        System.out.println("enter distance");
        distance = input.nextInt();
        System.out.println("enter weather");
        weather = input.nextInt();
        speed = calculateTheSpeed(distance, weather);
        System.out.println("The speed that reached the vehicle is ->:" + speed + "m/s");

    }

    private static float calculateTheDistance(float speed, float weather) {
        float distance;

        distance = speed * weather / 2;

        return distance;
    }

    private static float calculateTheSpeed(float distance, float weather) {
        float speed;

        speed = (distance / weather);

        return speed;
    }
}
