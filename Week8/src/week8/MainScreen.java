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

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements ActionListener {

    private CarPark park;
    private GridBagConstraints constraints;

    private JLabel lblTitle;
    private JLabel lblReg;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblStatus;


    private JTextField txtReg;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;

    private JButton btnAdd;
    private JButton btnRemove;
    

    public MainScreen(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
         constraints = new GridBagConstraints();
        
        initComponents();

        layoutComponents();
        
        park = new CarPark();
    }

    public void initComponents(){
        
        lblTitle = new JLabel("CAR PARK");
        
        lblReg = new JLabel("Reg no.");
        
        txtReg = new JTextField();
        
        btnAdd = new JButton("Add Car");
          btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove Car");
          btnRemove.addActionListener(this);
        
    }
    
    public void layoutComponents(){
        
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblTitle, constraints);
        
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblReg, constraints);
        
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtReg, constraints);
        
       constraints.fill = GridBagConstraints.NONE;
       constraints.gridy = 2;
       constraints.gridx = 0;
       this.add(btnAdd, constraints);
       
       constraints.gridx = 1;
       this.add(btnRemove, constraints);
    }


    @Override
    public void actionPerformed(ActionEvent ev) {
        
      
        
        if(ev.getSource().equals(btnAdd)){
            
            String reg = txtReg.getText();
            
            if(park.addCar(new Car(reg))){
                
                JOptionPane.showMessageDialog(null, "Car has been added!");
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Is no space on the park!");
            }
        }
    }
}
