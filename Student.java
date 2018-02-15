/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.umltocode;

public class Student extends Person {

    private String stuId;
    private double cgpa;

    public Student(String stuId, double cgpa) {
        this.stuId = stuId;
        this.cgpa = cgpa;
    }

    public Student(String name, String phone, String stuId, double cgpa) {
        super(name, phone);
        this.stuId = stuId;
        this.cgpa = cgpa;
    }
    
    @Override
    public void display() {
        System.out.println("Name is " + name + "\nPhone is " + phone +
                "\nID is " + stuId + "\nCgpa is " + cgpa);
    }

}
