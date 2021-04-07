/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.continent.controler;

import ec.edu.espe.continent.molde.Continent;
import utils.FileManager;

/**
 *
 * @author Personal
 */
public class ContinentController {


    public void save(Continent continent) {
        String data = continent.getContinents() + " , " + continent.getCountryNumber() + " , " + continent.getNumberOfInhabitants() + " , " + continent.getTouristicCountry() +" , " + continent.isFavoriteContinent();

        FileManager.save(data, "continents");

    }

    
}


