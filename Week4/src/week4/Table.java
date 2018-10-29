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
public class Table 
{
    private int tnum;
    private int numseats;
    private boolean isoutside;
    private Staff assignedStaff;
    private Booking booking;
    
    public Table(int num,int seats, boolean outside)
    {
        tnum = num;
        numseats = seats;
        isoutside = outside;
    }
    
    public void assignedStaff(Staff staffIn)
    {
        assignedStaff = staffIn;
    }
    
    public boolean bookTable(Booking bookIn)
    {
        if(numseats >= bookIn.getNumGuest() && isoutside == bookIn.wantOutside())
        {
            booking = bookIn;
            return true;
        }
        return false;
    }
    
    public void ClearBooking()
    {
        booking = null;
    }
}
