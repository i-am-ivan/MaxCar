/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstartup;
/**
 *
 * @author hmouissa
 */
import java.util.HashMap;
import java.util.*;
import javax.swing.*;

public class MaxCarDB {

    private HashMap <String, Car> carList;
    private static String errors = "";
    
    public static HashMap<String, Car>loadCars(){
        //add code to load data from the file into the hashmap
        HashMap<String,Car> carList = new HashMap<String, Car>();
        try{
            // Load car list from data file to hashmap
        }
        catch(Exception e){ errors += "ERROR! Failed to load Car List to HashMap " + " \n " + e.getMessage(); }
        
        return carList;    
    }
    
    public static void saveCars(HashMap<String,Car> carList){
        //add code to save data from the hashmap into a file
        try {}
        catch(Exception e){}
    }

    private static void addErrors(String errorMessage){ errors += errorMessage + " \n "; }
    private static  String getErrors(){ return errors; }
    private static void clearErrors(){ errors = ""; }
    
}
