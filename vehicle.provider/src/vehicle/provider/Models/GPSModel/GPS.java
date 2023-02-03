/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.provider.Models.GPSModel;

import vehicle.provider.View.GPSListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.*;

/**
 *
 * @author ravimal
 */
public class GPS {
    private GPSListener gpsListener;
    private String id;
    private double lat;
    private double lon;
    private double previousLatitude;
    private double previousLongtitude;
    
    Random rnd;
    
    public GPS(String id){
        this.id = id;
        rnd = new Random(System.currentTimeMillis());
        lat = 7+rnd.nextDouble();
        lon = 80+rnd.nextDouble();
    }
    
    public void setGPSListener(GPSListener listener){
        this.gpsListener = listener;
    }
    
    public void startGPSSimulation(){
        new Simulator().start();
    }
    
    private class Simulator extends Thread{
        
        @Override
        public void run(){
            while(true){
                
                    if(gpsListener!=null){
                        previousLatitude = lat;
                        previousLongtitude = lon;
                        lat = lat+rnd.nextDouble()/100.0;
                        lon = lon+rnd.nextDouble()/100.0;
                        gpsListener.onChangeLocation(lat, lon, id);
                        calculateDistance(previousLatitude, previousLongtitude, lat, lon, id);
                    }
                  try {
                    sleep(15000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GPS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void calculateDistance(double preLat, double preLon, double lat, double lon, String id){
        
        double dLatitude = Math.toRadians(preLat - lat);
        double dLongtitude = Math.toRadians(preLon - lon);
        
        double a = Math.sin(dLatitude/2)*Math.sin(dLongtitude/2)+
                Math.cos(Math.toRadians(preLat)) * Math.cos(Math.toRadians(lat))*
                Math.sin(dLongtitude/2)*Math.sin(dLatitude/2);
        
        double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        double distance = 6371 * c;
        System.out.println("The distance travel by " + id + " is: " + distance + "km");
    }
}
