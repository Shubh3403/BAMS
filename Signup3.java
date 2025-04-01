package bankingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/form.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(0, 0, 1000, 720);
        add(l14);
        
        l1 = new JLabel("Page 3: ACCOUNT DETAILS ");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setForeground(Color.ORANGE);
        
        l2 = new JLabel("Account Type:");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-4184");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 12-digit Card number)");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
       l7 .setForeground(Color.white);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit password)");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services Required:");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        l11.setForeground(Color.YELLOW);
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setForeground(Color.YELLOW);
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.CYAN);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.CYAN);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.CYAN);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.CYAN);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.CYAN);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.CYAN);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(Color.CYAN);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.CYAN);
        
      
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.CYAN);
        
       
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
       
        groupgender.add(r3);
        
        
        setLayout(null);
        
        l11.setBounds(670,10,70,30);
        l14.add(l11);
        
        l12.setBounds(770,10,40,30);
        l14.add(l12);
        
        l1.setBounds(220,40,500,40);
        l14.add(l1); 
        
        l2.setBounds(100,140,200,30);
        l14.add(l2);
        
        r1.setBounds(100,180,150,30);
        l14.add(r1);
        
        
        
        r3.setBounds(100,220,150,30);
        l14.add(r3);
        
       
        
        l3.setBounds(100,300,200,30);
        l14.add(l3);
        
        l4.setBounds(330,300,250,30);
        l14.add(l4);
        
        l5.setBounds(100,330,200,20);
        l14.add(l5);
        
        l6.setBounds(330,330,500,20);
        l14.add(l6);
        
        l7.setBounds(100,370,200,30);
        l14.add(l7);
        
        l8.setBounds(330,370,200,30);
        l14.add(l8);
        
        l9.setBounds(100,400,200,20);
        l14.add(l9);
        
        l10.setBounds(100,450,200,30);
        l14.add(l10);
        
        c1.setBounds(100,500,200,30);
        l14.add(c1);
        
        c2.setBounds(350,500,200,30);
        l14.add(c2);
        
        c3.setBounds(100,550,200,30);
        l14.add(c3);
        
        c4.setBounds(350,550,200,30);
        l14.add(c4);
        
        c5.setBounds(100,600,200,30);
        l14.add(c5);
        
        c6.setBounds(350,600,200,30);
        l14.add(c6);
        
        c7.setBounds(100,650,600,20);
        l14.add(c7);
        
        b1.setBounds(250,690,100,30);
        l14.add(b1);
        
        b2.setBounds(420,690,100,30);
        l14.add(b2);
                
        setSize(850,850);
        setLocation(300,0);
        setVisible(false);
        setUndecorated(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000L;
        String cardno = "" + Math.abs(first7);
        
           
        long first15 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String accno = "" + Math.abs(first15);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"','"+accno+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "A/C NO: " +accno + "\n Pin:"+ pin + "\n PLEASE NOTE DOWN THE DETAILS         " );
                    

                    setVisible(false); new Login();
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
    
}


