/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author 4SERED52
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bus b = new Bus();
        
        
        b.addPassenger(new Passenger( "Daniel", 18 ));
        System.out.println(b.toString());
        
        b.removePassenger("Daniel");
        System.out.println(b.toString());
        
        
    }
    
}
