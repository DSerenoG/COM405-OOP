/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Danie
 */
public class Booking 
{
    private String name;
    private int numGuest;
    private boolean outside;
    
    public Booking(String nameIn, int guestIn, boolean isOutside)
    {
        name = nameIn;
        numGuest = guestIn;
        outside = isOutside;
    }  
    
    public String getName()
    {
        return name;
    }
    
    public int getNumGuest()
    {
        return numGuest;
    }
    
    public boolean wantOutside()
    {
        return outside;
    }
}
