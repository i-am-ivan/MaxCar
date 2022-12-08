/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstartup;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;

public class Validator
{
    public static String errorMsg = "";

    public static String getValidVin(String aVin){
        //loop to make sure input is valid
        while(isValidVin(aVin) == false){
            errorMsg = JOptionPane.showInputDialog(null, " VIN: " + aVin + " is invalid\n\nPlease reenter a valid VIN");
        }
        return aVin;
    }
    private static boolean isValidVin(String aVin){
        //create a variable to hold result
        boolean result = true;
        //Add code to validate the VIN number here
        if(aVin.length() != 5 || aVin.matches("[a-zA-Z0-9]+") != true){
            result = false;
        }
        return result;
    }

    public  static  String getValidMake(String aMake){
        if(isValidMake(aMake)){
            errorMsg += (" INVALID INPUT! Make cannot be blank \n");
        }
        return aMake;
    }
    private static boolean isValidMake(String aMake){
        boolean result = false;
        if(aMake.length() < 1){
            result = false;
        }
        return result;
    }

    public static String getValidModel(String aModel){
        if(isValidModel(aModel)){
            errorMsg += ("");
        } return aModel;
    }
    private static boolean isValidModel(String aModel){
        boolean result = true;
        if(aModel.length() < 1){ result = false; }
        return result;
    }

    public static int getValidYear(int aYear){
        if(isValidYear(aYear) == false){ errorMsg += (" INVALID INPUT! Year cannot be blank. Enter Year between 1900 and 2900. \n"); }
        return aYear;
    }
    private static boolean isValidYear(int aYear){
        boolean result = true;
        if(aYear < 1){ result = false; }
        return result;
    }

    public static String getError() { return errorMsg; }
    // Clear Error message
    public static void clearErrorMsg() { errorMsg = ""; }
}
