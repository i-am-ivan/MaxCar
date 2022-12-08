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
public class Car {
    private String vin;
    private String make;
    private String model;
    private int year;
    
    
    //add constructor
    public Car(String vin, String make, String model, int year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    //add getters and setters
    public  String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    // Car information
    //@Override
    public String getSummary(){
        return " Vin \t : " + this.vin + ", Make \t : " + this.make + ", Model \t : " + this.model + ", Year \t : " + this.year;
    }

    // Check car records redundancy
    // @Override
    // public boolean equals(Object obj){
    //    if(obj instanceof Car){
    //       Car car = (Car) obj;
    //        return car.vin.equals(vin);
    //    }else {
    //        return false;
    //    }
   // }
    
}
