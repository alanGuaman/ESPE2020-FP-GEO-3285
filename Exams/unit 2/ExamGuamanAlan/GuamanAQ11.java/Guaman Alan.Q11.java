package guamanaq11;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class GuamanAQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------Guaman Alan----------");

        

        int sum = 0;
        int[] number = new int[5];
        float calculateTheAverageOfThreeNumbers[] = new float[3];
        float average = 0;

        System.out.println("Plase Ingrese la cantidad de numeros que desea sumar:");
        sum = getTheSumOfAnArray(number, sum);
        
        
        
        System.out.println("Enter the numbers of the array -> ");

        average = GetTheAverage(calculateTheAverageOfThreeNumbers, scanner, average);

        System.out.println("the average of the array is -> " + average);
        

    }

    private static int getTheSumOfAnArray(int[] number, int sum) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrse el valor que quiere sumar " + i + "->");
            number[i] = scanner.nextInt();
            sum += number[i];
            System.out.println("The sum of the inserted values ->" + sum);
        }
        return sum;
    
    }

    public static float GetTheAverage(float[] calculateTheAverageOfThreeNumbers, Scanner scanner, float average) {
        for (int i = 0; i < 3; i++) {
            averageOfThreeNumbers[i] = scanner.nextFloat();
        }
        for (float num : calculateTheAverageOfThreeNumbers) {
            average =((average + num) / 3);

        }
        return average;

    }

}


        