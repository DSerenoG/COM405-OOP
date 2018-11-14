/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author Danie
 */
import java.util.Scanner;


public class Week8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MainScreen gui = new MainScreen();
        gui.pack();
        gui.setVisible(true);
        
        
        
        CarPark cp = new CarPark();

    int state = 1;

    do {
      System.out.println("A - add car");
      System.out.println("B - remove car");
      System.out.println("C - free spaces");
      System.out.println("x - exit");

      System.out.println("Please enter a value: ");
      Scanner scanIn = new Scanner(System.in);

      String input = scanIn.nextLine();

      if (input.equals("A")) {
        String reg = scanIn.nextLine();

        Car c = new Car(reg);

        

        if (cp.addCar(c)) {
          System.out.println("yay");
        } 
        else 
        {
          System.out.println("Car park is full");
        }
      }

      else if (input.equals("B")) 
      {
          if(cp.removeCar(input))
          {
              System.out.println("Car removed");
          }
      }

      else if (input.equals("C"))
       {

        System.out.println("Free spaces" + cp.getFreeSpaces());
      }

      else if (input.equals("x")) 
      {
        state = 0;
      }

      else {
        System.out.println("Input is invalid");
      }

    } while (state == 1);

   
    }
    
 
}
