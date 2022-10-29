/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.lang.Math;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class Model {
    //Creaate instancew of Center class
    Center[] centers = new Center[8];

    //Initialize the centers
    public Model() {
        centers[0] = new Center("Ladkrbang (LKB)", 13.73, 100.78, "N", "E");
        centers[1] = new Center("Delhi (DL)", 28.61, 77.23, "N", "E");
        centers[2] = new Center("London (LDN)", 51.51, 0.13, "N", "W");
        centers[3] = new Center("Paris (PRS)", 48.86, 2.35, "N", "E");
        centers[4] = new Center("Sydney (SDN)", 33.87, 151.21, "S", "E");
        centers[5] = new Center("New York (NY)", 40.71, 74.01, "N", "W");
        centers[6] = new Center("Madagascar (MDG)", 18.92, 47.52, "N", "W");
        centers[7] = new Center("Aamzon (AMZ)", 15.52, 71.69, "S", "W");
    }

    //Calculate the distance between two points
    public String getNearestCenter(double lat, double longi, String lat_indict, String long_indict) {
        String nearestCenter = "";
        double minDistance = Integer.MAX_VALUE;
        double actualLat = 0, actualLong = 0;
        for (Center c : centers) {
            System.out.println("CENTER: " + c.getName());
            actualLat = getActualDistnce(lat, c.getLatitude(), lat_indict, c.getLat_indicator());
            actualLong = getActualDistnce(longi, c.getLongitude(), long_indict, c.getLong_indicator());
            double distance = getDistance(actualLat, actualLong);
            if (distance < minDistance) {
                minDistance = distance;
                nearestCenter = c.getName();
            }
        }
        return nearestCenter;
    }

    //<-----------------MATHEMTICS CALCULATIONS----------------->
    // Get distnce by Pythagorean theorem
    private double getDistance(double lat, double longi) {
        System.out.println("LAT: " + lat + "\nLONG: " + longi);
        System.out.println("DISTANCE:" + Math.sqrt(lat*lat + longi*longi));
        return Math.sqrt(lat*lat + longi*longi);
    }

    //Get the absolute distance between two points
    private double getActualDistnce(double location1, double location2, String indicator1, String indicator2) {
        System.out.println("GET ACT DIST");
        System.out.println(location1 + " " + location2 + " " + indicator1 + " "  + indicator2);
        return indicator1.equals(indicator2) ? Math.abs(location1 - location2) : Math.abs(location1 + location2);
    }
}
