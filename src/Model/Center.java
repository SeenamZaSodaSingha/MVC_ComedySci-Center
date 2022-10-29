/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class Center {
    //Properites of Comedy center
    private String name = "";
    private double latitude = 0, longitude = 0;
    private String lat_indicator  = "", long_indicator = "";

    //Constructor
    public Center() {
        
    }
    
    //Overloaded constructor
    public Center(String name, double lat, double longi, String lat_indict, String long_indict) {
        this.name = name;
        this.latitude = lat;
        this.longitude = longi;
        this.lat_indicator = lat_indict;
        this.long_indicator = long_indict;       
    }

    //<-----------------SETTERS AND GETTERS----------------->
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLat_indicator() {
        return lat_indicator;
    }

    public void setLat_indicator(String lat_indicator) {
        this.lat_indicator = lat_indicator;
    }

    public String getLong_indicator() {
        return long_indicator;
    }

    public void setLong_indicator(String long_indicator) {
        this.long_indicator = long_indicator;
    }
}
