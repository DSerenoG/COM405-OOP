/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author Danie
 */
public class Week9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bird b1 = new Bird();
        Plane p1 = new Plane();
        Helicopter h1 = new Helicopter();
        
        System.out.println(b1.makeSound());
        System.out.println(p1.makeSound());
        System.out.println(h1.makeSound());
    }
    
}
