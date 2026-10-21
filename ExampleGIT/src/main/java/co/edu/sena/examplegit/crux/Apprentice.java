/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplegit.crux;

/**
 *
 * @author Aprendiz
 */
public class Apprentice {
    private String fullname;
    private int age;
    private double phone;
    
    public Apprentice() {
    }

    public Apprentice(String fullname, int age, double phone) {
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Apprentice{" + "fullname=" + fullname + '}';
    }
}
