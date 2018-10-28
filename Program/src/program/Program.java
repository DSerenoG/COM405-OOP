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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog d1 = new Dog("Rex", 16, 60);
        Dog d2 = new Dog("Luck", 20, 80);
        
        d1.walk();
        d1.sleep();
        
        d2.walk();
        
        System.out.println("Name:" + d1.getName());
        System.out.println("Weight:" + d1.getWeight());
        System.out.println("Energy:" + d1.getEnergy());
        
        System.out.println("Name:" + d2.getName());
        System.out.println("Weight:" + d2.getWeight());
        System.out.println("Energy:" + d2.getEnergy());
        
    }
    
}
