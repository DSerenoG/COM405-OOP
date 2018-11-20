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
public class FrontlineEmployee extends Employee
{
  public FrontlineEmployee(String nameIn, double payIn, int hoursIn, int holidayIn)
  {
    super(nameIn, payIn, hoursIn, holidayIn);
  }

  @Override
  public double getSalary()
  {
    return (pay * hours)*52;
  }

  public String lplp(){
      return "Esta";
  }


}