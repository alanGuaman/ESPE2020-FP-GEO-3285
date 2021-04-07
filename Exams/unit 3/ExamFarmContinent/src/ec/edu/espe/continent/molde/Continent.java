/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.continent.molde;

/**
 *
 * @author Personal
 */
public class Continent {

    private String continents;
    private int countryNumber;
    private float NumberOfInhabitants;
    private String  mostTouristicCountry;
    private boolean favoriteContinent;

    public Continent(String cotinent, int countryNumber, float NnumberOfInhabitants, String touristicCountry, boolean favoriteContinent) {
        this.continents = cotinent;
        this.countryNumber = countryNumber;
        this.NumberOfInhabitants = NnumberOfInhabitants;
        this.mostTouristicCountry = touristicCountry;
        this.favoriteContinent = favoriteContinent;
    }
    
    /**
     * @return the continents
     */
    public String getContinents() {
        return continents;
    }

    /**
     * @param continents the continents to set
     */
    public void setContinents(String continents) {
        this.continents = continents;
    }

    /**
     * @return the countryNumber
     */
    public int getCountryNumber() {
        return countryNumber;
    }

    /**
     * @param countryNumber the countryNumber to set
     */
    public void setCountryNumber(int countryNumber) {
        this.countryNumber = countryNumber;
    }

    /**
     * @return the NumberOfInhabitants
     */
    public float getNumberOfInhabitants() {
        return NumberOfInhabitants;
    }

    /**
     * @param NumberOfInhabitants the NumberOfInhabitants to set
     */
    public void setNumberOfInhabitants(float NumberOfInhabitants) {
        this.NumberOfInhabitants = NumberOfInhabitants;
    }

    /**
     * @return the touristicCountry
     */
    public String getTouristicCountry() {
        return mostTouristicCountry;
    }

    /**
     * @param touristicCountry the touristicCountry to set
     */
    public void setTouristicCountry(String touristicCountry) {
        this.mostTouristicCountry = touristicCountry;
    }

    /**
     * @return the favoriteContinent
     */
    public boolean isFavoriteContinent() {
        return favoriteContinent;
    }

    /**
     * @param favoriteContinent the favoriteContinent to set
     */
    public void setFavoriteContinent(boolean favoriteContinent) {
        this.favoriteContinent = favoriteContinent;
    }

}
