/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apollo.apollo;

/**
 *
 * @author 16536096
 */
public class Order {
    private double price;
    private double volume;
    private int nrOf = 1;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setNrOf(int nrOf) {
        this.nrOf = nrOf;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public int getNrOf() {
        return nrOf;
    }
    
    
   
    
     @Override
    public String toString() {
        return "Price: " + price + "Volume: " + volume + "\tNumber of: " + nrOf;
    }
    
}
