/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Danie
 */
public class Heart 
{
   private int bpm;
   private int restingRate;
   
   public Heart(int restIn)
   {
       restingRate = restIn;
       bpm = restIn;
   }
   
   public boolean increaseBPM(int increaseRate)
   {
       if(bpm < restingRate + 100)
       {
           bpm = bpm +increaseRate;
           return true;
       }
       return false;
   }
   
   public void rest()
   {
       bpm = restingRate;
   }
   
   public int getBPM()
    {
        return bpm;      
    }
}
