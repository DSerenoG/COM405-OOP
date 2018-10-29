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
public class Bus 
{
    private Passenger[] passBus;
    private int seats;
    private boolean addPassenger;
    
    public Bus()
    {
        passBus = new Passenger[15];
    }
    
    public boolean addPassenger(Passenger passIn)
    {
        for(int seats = 0;seats < passBus.length; seats++)
        {
            if(passBus[seats] == null)
            {
                passBus[seats] = passIn;
                return true;
            }
        }
        return false;
    }
    
    public boolean removePassenger(String passIn)
    {
        for(int seats = 0; seats < passBus.length; seats++)
        {
            if(passBus[seats] != null)
            {
                String Passenger = passBus[seats].getName();
                
                if(Passenger == passIn)
                {
                    passBus[seats] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
   public int getSeats()
   {
       return seats;
   }

}
