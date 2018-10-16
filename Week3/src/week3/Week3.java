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
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Car car1 = new Car();
        Car car2 = new Car(30, 150);
        
        car1.setCurrentSpeed(50);
        car1.setFuelLevel(100);
        car1.setMaxSpeed(60);
        
        
        
        System.out.println("Current Speed car1 " + car1.getCurrentSpeed());
        System.out.println("Fuel level car1 " + car1.getFuelLevel());
        System.out.println("Max speed car1 " + car1.getMaxSpeed());
        
        System.out.println("Current speed car2 " + car2.getCurrentSpeed());
        System.out.println("Fuel level car2 " + car2.getFuelLevel());
        System.out.println("Max speed car2 " + car2.getMaxSpeed());
        
        car1.acceleration();
        System.out.println("Current Speed car1 " + car1.getCurrentSpeed());
        System.out.println("Fuel level car1 " + car1.getFuelLevel());
        
        car2.brake();
        System.out.println("Current speed car2 " + car2.getCurrentSpeed());
        
        Car car3 = new Car();
        System.out.println("Current speed car3 " + car3.getCurrentSpeed());
        System.out.println("Fuel Level car3 " + car3.getFuelLevel());
        System.out.println("Max speed car3 " + car3.getMaxSpeed());
    }
    
}
