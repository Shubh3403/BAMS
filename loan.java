/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingsystem;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Asus Vivobook
 */
public class loan extends JFrame{
    
    loan(){
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/form.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        
        l14.setBounds(240,0, 1300, 800);
        add(l14);
    setSize(1300, 800);
        setLocation(240,0);
      setVisible(true);  }
    public static void main (String args[]){
     new loan();
}
}
