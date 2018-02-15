/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author MAHBUB
 */
public class MainGeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeoObject geoObject = new GeoObject();
        GeoObject geoObjectSecond = new GeoObject("Red", true);
        
        System.out.println("Geo object one color is " + geoObject.getColor());
        System.out.println("Geo object one filled value is " + geoObject.isFilled());
        
        System.out.println("Geo object second color is " + geoObjectSecond.getColor());
        System.out.println("Geo object second filled value is " + geoObjectSecond.isFilled());
        
        Rectangle rectangle = new Rectangle(3.5, 2.5, "White", true);
        System.out.println("Rectangle color is " + rectangle.getColor());
        System.out.println("Rectangle filled value is " + rectangle.isFilled());
        System.out.println("Rectangle width is " + rectangle.getWidth());
        System.out.println("Rectangle height is " + rectangle.getHeight());
    }
}
