/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 4SERED52
 */
public class Car {

    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    private int acceleration;

    /**
     * @return the currentSpeed
     */
    public int getCurrentSpeed() 
    {
        return currentSpeed;
    }

    /**
     * @param currentSpeed the currentSpeed to set
     */
    public void setCurrentSpeed(int currentSpeed)
    {
        currentSpeed = currentSpeed;
    }

    /**
     * @return the maxSpeed
     */
    public int getMaxSpeed() 
    {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(int maxSpeed) 
    {
        maxSpeed = maxSpeed;
    }

    /**
     * @return the fuelLevel
     */
    public int getFuelLevel()
    {
        return fuelLevel;
    }

    /**
     * @param fuelLevel the fuelLevel to set
     */
    public void setFuelLevel(int fuelLevel)
    {
        fuelLevel = fuelLevel;
    }
    
    public void acceleration()
    {
        currentSpeed = currentSpeed + 5;
        fuelLevel = fuelLevel - 2;
    }
    
    public void brake()
    {
       currentSpeed = currentSpeed - 10;
    }
    
    public void refuel()
    {
        fuelLevel = fuelLevel + 2;
    }
    
    public Car()
    {
        currentSpeed = 70;
        maxSpeed = 100;
        fuelLevel = 80;
    }
    
    public Car(int currentSpeedIn, int maxSpeedIn)
    {
        currentSpeed = currentSpeedIn;
        maxSpeed = maxSpeedIn;
        fuelLevel = 50;
    }
}
