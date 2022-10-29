/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.Model;
/**
 *
 * @author SeenamZaSodaSingha
 */
public class Control {
    //Create variable of Model class
    Model model;
    
    //Constructor
    public Control(){
        //Aassign instance to Model variable
        model = new Model();
    }
    
    //get nearest center from model
    public String getNerestCenter(double lat, double longi, String lat_indict, String long_indict){
        String nearestCenter = model.getNearestCenter(lat, longi, lat_indict, long_indict);
        return nearestCenter;
    }
}
