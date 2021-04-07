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
public class Searcher {
    
        public static int findInteger(String[] brandNames, String search) {
        
        for (int i = 0; i < 6; i++) {
             if (search.equals(brandNames[i])) {
                return i;
            }
        }
        return -1;

    }
}
