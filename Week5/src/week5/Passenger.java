/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Danie
 */
public class Passenger
{
    private String name;
    private int age;
    
    public Passenger(String nameIn, int ageIn)
    {
     name = nameIn;
     age = ageIn;
    }  
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    @Override
    public String toString() {
        return "Passenger{ name=" + name + ", age=" + age +'}';
    }
}
