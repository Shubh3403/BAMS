
package bankingsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Asus Vivobook
 */
public class profile extends JFrame  {
      JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11,l13, l14, l15,l0;
     String formno;
    profile( String formno)
    { this.formno = formno;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/form.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(240,0, 1300, 800);
        add(l14);
        
        l1 = new JLabel();
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setForeground(Color.white);
        l1.setBounds(300,30,500,40);
        l14.add(l1);
        
         l7 = new JLabel();
        l7.setForeground(Color.white);
        l7.setFont(new Font("Raleway", Font.BOLD, 30));
         l7.setBounds(510,30,500,40);
        l14.add(l7);
        
          l10 = new JLabel();
        l10.setForeground(Color.white);
        l10.setFont(new Font("Raleway", Font.BOLD, 30));
        l10.setBounds(720,30,500,40);
        l14.add(l10);
        
        l2 = new JLabel("Account no :");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l2.setBounds(100,120,150,30);
        l14.add(l2);
        
         l8 = new JLabel();
        l8.setForeground(Color.white);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
          l8.setBounds(260,120,170,30);
        l14.add(l8);
     
       
        
        
        l3 = new JLabel("Address:");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,170,100,30);
        l14.add(l3);
        
          l0 = new JLabel();
        l0.setForeground(Color.white);
        l0.setFont(new Font("Raleway", Font.BOLD, 18));
        l0.setBounds(260,170,100,30);
        l14.add(l0);
        
        l4 = new JLabel("IFSC CODE :         MNBH0065063");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100,220,300,30);
        l14.add(l4);
        
        l5 = new JLabel("Account Type :");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
         l5.setBounds(100,270,150,30);
        l14.add(l5);
        
           l11= new JLabel();
        l11.setForeground(Color.white);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
         l11.setBounds(260,270,150,30);
        l14.add(l11);
        
        l6 = new JLabel("Customer ID:");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100,320,150,30);
        l14.add(l6);
        
        l9 = new JLabel(formno);
        l9.setForeground(Color.white);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
          l9.setBounds(260,320,150,30);
        l14.add(l9);
        
        
      
  try 
        {
            Conn c=new Conn();
            String query ="select* from signup where formno='"+formno+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
                l1.setText(rs.getString("name"));
                l7.setText(rs.getString("fname"));
               l10.setText(rs.getString("lname"));
                l0.setText(rs.getString("address"));

            }
        }
        catch(Exception e){}
  
  try 
        {
            Conn c=new Conn();
            String query ="select* from signup3 where formno='"+formno+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
                l8.setText(rs.getString("accno"));
        
                          
            }
        }
        catch(Exception e1)
        {}
        
   try 
        {
            Conn c=new Conn();
            String query ="select* from signup3 where formno='"+formno+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
               
                l11.setText(rs.getString("atype"));
//               
//                
            }
        }
        catch(Exception e1){}setSize(1300, 800);
        setLocation(240,0);
      setVisible(true);  
    }
    public static void main (String args[]){
     new profile("");
}}
