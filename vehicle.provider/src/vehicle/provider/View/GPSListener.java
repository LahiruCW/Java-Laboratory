/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.provider.View;

/**
 *
 * @author ravimal
 */
public interface GPSListener {
    public void onChangeLocation(double lat, double lon, String id);
}
