/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controler;

/**
 *
 * @author Personal
 */
public class Sorting {
    
    public String[] sortByBubbleSort(String[]brandNames) {
             
	String temp;
        
	System.out.println("Strings in sorted order:");
	for (int j = 0; j < brandNames.length; j++) {
   	   for (int i = j + 1; i < brandNames.length; i++) {
		// comparing adjacent strings
		if (brandNames[i].compareTo(brandNames[j]) < 0) {
			temp = brandNames[j];
			brandNames[j] = brandNames[i];
			brandNames[i] = temp;
		}
	   }
	   System.out.println(brandNames[j]);
	}
        return brandNames;
   
    }

    public String[] sortBySelection(String[] brandNames) {
        // CODE TO SORT
        
        return brandNames;
    }
}
