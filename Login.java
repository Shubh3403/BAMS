package bankingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Login(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);   
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/log.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0,0, 1300, 750);
        add(l11);
        
        l1 = new JLabel(" WELCOME TO MNB BANK ");
        l1.setFont(new Font("Osward", Font.BOLD, 45));
        l1.setBounds(340,120,750,100);
        l1.setForeground(Color.YELLOW);
        l11.add(l1);
        
        
        l2 = new JLabel("A/C NO.");
        l2.setFont(new Font("Raleway", Font.BOLD, 30));
        l2.setBounds(420,260,400,40);
        l2.setForeground(Color.WHITE);
        l11.add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(620,260,300,40);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        l11.add(tf1);
             
        l3 = new JLabel("PASSWORD:");
        l3.setFont(new Font("Raleway", Font.BOLD, 30));
        l3.setBounds(420,340,400,40);
        l3.setForeground(Color.WHITE);
        l11.add(l3);       
        
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(620,340,300,40);
        l11.add(pf2);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        
        setLayout(null);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(700,420,180,45);
        l11.add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(550,480,200,45);
        l11.add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(420,420,180,45);
        l11.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setSize(800,480);
        setLocation(206,120);
        setUndecorated(true);
        setVisible(true);
        
    }
 public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()==b1){
                Conn c1 = new Conn();
                String cardno  = tf1.getText();
                String pin  = pf2.getText();
                String q  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                   new Dashbord("").setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }else if(ae.getSource()==b3){
               
                new Signup().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
       new Login().setVisible(true);
        
    }}

    
