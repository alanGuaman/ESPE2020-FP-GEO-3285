/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.controler;

import ec.edu.espe.farmsystem.molde.Shoe;
import utils.FileManager;

/**
 *
 * @author Personal
 */
public class ShoeController {
    
    public void save (Shoe shoe){
        String data = shoe.getMark() + " , " + shoe.getColor() + "," + shoe.getSize() + "," + shoe.getPrice() + "," +shoe.isShoeMaterial();
        FileManager.save(data, "shoes");
        
    }
    
}
