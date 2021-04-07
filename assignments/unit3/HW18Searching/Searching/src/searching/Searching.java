/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int[] numbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 25, 28, 30};
        int[] multipliesOfNine = {5, 10, 15, 20, 30, 35, 40, 45, 50};
        int result;
        int x;
        int left = 0;
        int right = 0;
        
        
        System.out.println("Search for the numbers from 2 to 30");
        

        x = getTheNumberToSearch();

        result = executeLinearSearch(numbers, x);
        System.out.println("the number is in the position -> " + result);
        

        System.out.println("");
        System.out.println("The binary search is multiplied by 5: ");

        x = getTheNumberToSearch();

        result = executeBinarySearch(multipliesOfNine, left, right, x);
        System.out.println("the number is in the position -> " + result);

    }

    public static int getTheNumberToSearch() {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to search in the array ->");
        x = input.nextInt();
        return x;
    }

    public static int executeLinearSearch(int firstTenPrimeNumbers[], int x) {
        int n = firstTenPrimeNumbers.length;
        for (int i = 0; i < n; i++) {
            if (firstTenPrimeNumbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int executeBinarySearch(int elements[], int left, int right, int x) {
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (elements[mid] == x) 
                return mid;
            
            if (elements[mid] > x) 
                return executeBinarySearch(elements,left,mid-1,x);
            

            return executeBinarySearch(elements, mid + 1, right, x);
        }
        return -1;
    }
}
    