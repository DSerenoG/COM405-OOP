/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author 4SERED52
 */
public class Week4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
        Staff st1 = new Staff("Jonh");
        Staff st2 = new Staff ("Raul");
        
        Table t1 = new Table(1,20,true);
        Table t2 = new Table(2,10,false);
        
        Booking b1 = new Booking("Daniel",15,true);
        Booking b2 = new Booking("Bruno",20,false);
        Booking b3 = new Booking("lail",30,true);
        Booking b4 = new Booking("klds",5,false);
        
        
        if(t1.bookTable(b1))
        {
            System.out.println("Table Booked");
        }
        else
        {
            System.out.println("Booking unsucceful");
        }
   } 
}
