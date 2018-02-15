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
public class Teacher extends Person {

    private String designation;

    public Teacher(String designation) {
        this.designation = designation;
    }

    public Teacher(String name, String phone, String designation) {
        super(name, phone);
        this.designation = designation;
    }

    @Override
    public void display() {
        System.out.println("Name is " + name + "\nPhone is " + phone + 
                "\nDesignation is " + designation);
    }

}
