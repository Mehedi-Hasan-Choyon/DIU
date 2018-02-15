/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.umltocode;

/**
 *
 * @author ASUS
 */
public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
    
    public void display(){
        System.out.println("City is " + city + "\nCountry is " + country);
    }
    
}
