/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.molde;

/**
 *
 * @author Personal
 */
public class Shoe {

    private String Mark;
    private String color;
    private int size;
    private int price;
    private boolean shoeMaterial;

    public Shoe(String Mark, String color, int size, int price, boolean shoeMaterial) {
        this.Mark = Mark;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shoeMaterial = shoeMaterial;
    }

    /**
     * @return the Mark
     */
    public String getMark() {
        return Mark;
    }

    /**
     * @param Mark the Mark to set
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the shoeMaterial
     */
    public boolean isShoeMaterial() {
        return shoeMaterial;
    }

    /**
     * @param shoeMaterial the shoeMaterial to set
     */
    public void setShoeMaterial(boolean shoeMaterial) {
        this.shoeMaterial = shoeMaterial;
    }

}
