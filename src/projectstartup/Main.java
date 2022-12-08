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
import javax.swing.JOptionPane;
import javax.swing.*;

public class Main extends javax.swing.JFrame{
    private static HashMap<String, Car> carInventory;
    private JPanel jPanel;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton findButton;
    private JLabel lblTitle, lblVin, lblMake, lblModel, lblYear;
    private JTextField txtVin;
    private JTextField txtMake;
    private JTextField txtModel;
    private JTextField txtYear;

    // Constructor
    public Main(){
        //initialize the inventory
        carInventory = new HashMap<String, Car>();
    }

    public static void main(String[] args) {

       //Present the customer with a choice of vehicles
		String[]  choices = {"Add Car", "Remove Car", "Update Car", "List Cars", "Clear Cars", "Find Car", "Exit"};

                //keep the menu up unless exiting
                while(true){ 
                    int response = JOptionPane.showOptionDialog(
                                    null                       				// center over parent
                                    , "Database Operations"                 // message
                                    , "MaxCar the Best Car Dealership"      // title in title bar
                                    , JOptionPane.YES_NO_OPTION             // Option type
                                    , JOptionPane.PLAIN_MESSAGE  			// messageType
                                    , null                       			// icon
                                    , choices                    			// Options
                                    , "Select a MaxCar Operation"           // initial value
                    );
                    switch (response){

                        case 0:
                            addCar();
                            break;
                        case 1:
                            removeCar();
                            break;                      
                        case 2:
                            updateCar();
                            break;
                        case 3:
                            listCars();
                            break;
                        case 4:
                            clearCars();
                            break;
                        case 5:
                            findCar();
                            break;                            
                        default:
                            exitApplication();

                    }
                }
                
    }
    
    private static void addCar(){
        //add code to ask user for entry

        //add code to read the data entered and use split to break it into variables

        //add code to save the data entered by the user to the hashmap as a VIN and a CAR object
        
    }
    
    private static void removeCar(){
        //add code to ask user for data entry and remove a car from the hashmap
        //Example using the validator class to check data for issues
     
    }
    
    private static void updateCar(){
        //add code to ask user for data entry and update the car in the hashmap

    }
    
    private static void listCars(){
        //add code to display summary data of all the cars in the hashmap
    
    }
    
    private static void clearCars(){
        //add code to clear the hashmap
        carInventory.clear();
    }
    
    public static String findCar(){
        //add code to find the car in the hashmap
        String vin = null;
        String carInfomation = carInventory.get(vin).getSummary();
        return carInfomation;
    }
    private static void exitApplication(){
        JOptionPane.showMessageDialog(null, " Thank you for using the MaxCar Application. " + carInventory.size() + " cars saved!...EXITING...");
        System.exit(0);
    }
    
}
