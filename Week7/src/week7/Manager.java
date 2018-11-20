/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author Danie
 */
public class Manager extends Employee
{
  private int bonus;

  public Manager(String nameIn, double payIn, int hoursIn, int holidayIn, int bonusIn)
  {
    super(nameIn, payIn, hoursIn, holidayIn);
    bonus = bonusIn;    
  }

  @Override
  public double getSalary()
  {
    return (bonus * pay/100) + pay;
  }   

  public boolean setBonus(int bonusIn)
  {
    if(bonusIn <= 100 && bonusIn >= 0)
    {
      bonus = bonusIn;
      return true;
    }
    return false;
  }
  
  public String lplp(){
      return "boa!";
  }
}
