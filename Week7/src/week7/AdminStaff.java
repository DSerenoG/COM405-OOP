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
public class AdminStaff extends Employee
{
  private Manager manager;

  public AdminStaff(String nameIn, double payIn, int hoursIn, int holidayIn)
  {
    super(nameIn, payIn, hoursIn, holidayIn);
  }

  public Manager getManager()
  {
    return manager;
  }

  public Manager setManager(Manager managerIn)
  {
    return manager = managerIn;
  }

  public String toString()
  {
    String ret = super.toString();

    ret += "Manager name: " + manager.getName();
    return ret;
  }
  
  public String lplp(){
      return "Esta merda é que é boa!";
  }
}
