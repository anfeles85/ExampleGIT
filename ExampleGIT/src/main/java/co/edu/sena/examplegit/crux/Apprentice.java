/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplegit.crux;

/**
 * Fecha: 21/10/2026
 * @author Gabriela Isaziga
 * 
 */
public class Apprentice {
    private String fullname;
    private int age;
    private String phone;

    public Apprentice() 
    {
    }

    public Apprentice(String fullname, int age, String phone) 
    {
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
    }

    public String getFullname() 
    {
        return fullname;
    }

    public void setFullname(String fullname) 
    {
        this.fullname = fullname;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }
    
    @Override
    public String toString()
    {
        return fullname;
    }
}
