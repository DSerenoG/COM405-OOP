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
public class Dog 
{
  private Heart heart;
  private String name;
  private int weight;
  private int energy;
  
  
  
  public Dog(String nameIn, int weightIn, int energyIn)
  {
     heart = new Heart(60);
    name = nameIn;
    weight = weightIn;
    energy = energyIn;
  }
  
  
  public void walk()
  {
      if(heart.increaseBPM(5))
      {
         weight--;
        energy--; 
      }
      else
      {
          System.out.println("The dog is under too much strain");
      }
  }
  
  
  public void sleep()
  {
      energy++;
      heart.rest();
  }
  
  public String getName()
  {
      return name;
  }
  
  public int getWeight()
  {
      return weight;
  }
  
  public int getEnergy()
  {
      return energy;
  }
}
