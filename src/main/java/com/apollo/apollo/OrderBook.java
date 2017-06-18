/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apollo.apollo;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 16536096
 */
public class OrderBook {

    /**
     *
     * @return An OrderBookObject containing market data at the time of creation
     * - does not auto update.
     * @throws MalformedURLException
     * @throws UnsupportedEncodingException
     * @throws IOException
     *
     */
    public static OrderBook getOrderBookObject() throws MalformedURLException, UnsupportedEncodingException, IOException {

        OrderBook o;
        URL url = new URL("https://api.mybitx.com/api/1/orderbook?pair=XBTZAR");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {

           // System.out.println(reader.readLine());
            //reader.close();
            String in = reader.readLine();
            JsonElement json = new JsonParser().parse(in);

            Gson gson = new GsonBuilder().create();
            o = gson.fromJson(json, OrderBook.class);

            return o;

        } catch (Exception e) {
            System.out.println("ERROR: Could not download OrderBook data from server.");
        }

        return null;

    }

    private double timestamp;
    private String volume;
    private ArrayList<Order> asks = new ArrayList<>();
    private ArrayList<Order> bids = new ArrayList<>();

   
    @Override
    public String toString() {
        return "Orderbook Summary \n" + "Date: " + getDate() + "\nTime: " + getTime() + "\nAsks: " + asks.size() + "\nBids: " + bids.size();
    }

    public String getDate() {
        Calendar mydate = Calendar.getInstance();
        mydate.setTimeInMillis((long) (timestamp));
        return (mydate.get(Calendar.DAY_OF_MONTH) + "." + mydate.get(Calendar.MONTH) + "." + mydate.get(Calendar.YEAR));
    }

    public String getTime() {
        Calendar mydate = Calendar.getInstance();
        mydate.setTimeInMillis((long) (timestamp));
        return (mydate.get(Calendar.HOUR_OF_DAY) + ":" + mydate.get(Calendar.MINUTE) + ":" + mydate.get(Calendar.SECOND));
    }

    /**
     * 
     * @return an ArrayList containing all ask Orders 
     */
    public ArrayList<Order> getAsks() {
        return asks;
    }

    /**
     * 
     * @return an ArrayList containing all bid Orders 
     */
    public ArrayList<Order> getBids() {
        return bids;
    }
    
    /**
     * 
     * @return an ArrayList containing all ask Orders grouped by price. See nrOf property in Order.
     */

    public ArrayList<Order> getCondensedAsks() {
        ArrayList<Order> cAsks = new ArrayList<>();
        double temp = 0;
        Order tempOrder = new Order();

        for (Order ask : asks) {

            if (ask.getPrice() != temp) {
                tempOrder = new Order();
                temp = ask.getPrice();

                tempOrder.setPrice(temp);
                tempOrder.setVolume(ask.getVolume());
                tempOrder.setNrOf(1);
                cAsks.add(tempOrder);

            } else {

                tempOrder.setVolume(tempOrder.getVolume() + ask.getVolume());
                tempOrder.setNrOf(tempOrder.getNrOf() + 1);

            }

        }

        return cAsks;
    }
    
     /**
     * 
     * @return an ArrayList containing all bid Orders grouped by price. See nrOf property in Order.
     */

    public ArrayList<Order> getCondensedBids() {
        ArrayList<Order> cBids = new ArrayList<>();
        double temp = 0;
        Order tempOrder = new Order();

        for (Order bid : bids) {

            if (bid.getPrice() != temp) {
                tempOrder = new Order();
                temp = bid.getPrice();

                tempOrder.setPrice(temp);
                tempOrder.setVolume(bid.getVolume());
                tempOrder.setNrOf(1);
                cBids.add(tempOrder);

            } else {

                tempOrder.setVolume(tempOrder.getVolume() + bid.getVolume());
                tempOrder.setNrOf(tempOrder.getNrOf() + 1);

            }

        }

        return cBids;
    }

}
