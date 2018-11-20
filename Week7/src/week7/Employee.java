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
public abstract class Employee
{
  protected String name;
  protected double pay;
  protected int hours;
  protected int holiday;
  
  public Employee(String nameIn, double payIn, int hoursIn, int holidayIn)
  {
    name = nameIn;
    pay = payIn;
    hours = hoursIn;
    holiday = holidayIn;
  }

  public void setPay(double payIn)
  {
    pay = payIn;
  }

  public boolean changehours(int hrs)
  {
    if(hrs <= 40)
    {
      hours = hrs;
      return true;
    }
    return false;
  }

  public double getSalary()
  {
    return pay;
  }
  
  public String getName()
  {
    return name;
  }

  public boolean bookHoliday(int days)
  {
    if(holiday - days >= 0)
    {
      holiday -= days;
      return true;
    }
    return false;    
  }

  public String toString()
  {
    String ret = "Name: " + name + "\n" + "Salary: " + getSalary();

    return ret;
  }  
  
  public abstract String lplp();
}