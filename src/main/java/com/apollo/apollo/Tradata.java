/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apollo.apollo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 *
 * @author 16536096
 */
public class Tradata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException { // begin the main method #

     
        OrderBook book = OrderBook.getOrderBookObject(); // Create an OrderBookObject
        System.out.println(book); // *Print a summary of the OrderBook object
        
        
        ArrayList condensedBids = book.getCondensedBids(); // Make an ArrayList containing the condensed bids in the OrderBook object "book"
        ArrayList condensedAsks = book.getCondensedAsks(); // Make an ArrayList containing the condensed asks in the OrderBook object "book"
        
        System.out.println(condensedBids.get(0)); //get the 0th bid Order object in the condensedBids ArrayList and *print a summary.
        System.out.println(condensedAsks.get(9)); //get the 9th ask Order object in the condensedBids ArrayList and *print a summary.
        
        
        double length = condensedBids.size(); // Make a double - set its value to the size of the condensedBids ArrayList
        
        for (int i = 0; i < length; i++) // create a for-loop, integer "i" starts at 0; continues while the value of i < the value of "length"; adds 1 to the vlue of i for each cycle
        {// open the for loop
            
            
            System.out.println(condensedBids.get(i)); // *Print the i-th element of the condensedBids ArrayList
            
            // * - We are not really printing the value of the object, we are calling the object's toString Method which gives us a String - see toString methods in OrderBook and Order 
            
            
        }// close the for-loop
        
        
        

    }// close the main method #
    
    // # - The Main Method is started when we press the run button in Netbeans.
    // Any code outside of the main method will only run if it is called (directly or indirectly) from the main method. 
    
}
