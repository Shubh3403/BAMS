package bankingsystem;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Dashbord extends JFrame implements ActionListener{
 
    JButton b1,b2,b3,b4,b5,b6,b7;
 JLabel l1,l2,l3;
 String formno;
    Dashbord(String formno)
    { this.formno=formno;;
         setExtendedState(JFrame.MAXIMIZED_BOTH);
          setLayout(null);
          
           ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/b.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l111 = new JLabel(i6);
        l111.setBounds(240,0, 1300, 800);
        add(l111);
        
          JPanel p1 = new JPanel();
          p1.setLayout(null);
          p1.setBackground(Color.WHITE);
          p1.setBounds(0,0,240,900);
          add(p1);
          
            l1 = new JLabel("MNB");
        l1.setFont(new Font("Osward", Font.BOLD, 45));
        l1.setBounds(120,0,150,70);
        l1.setForeground(Color.YELLOW);
        p1.add(l1);
        
           
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0,0, 120, 70);
        p1.add(l11);
        
        
           b1 = new JButton("Profile");
          b1.setLayout(null);
        b1.setBackground(new Color(211,211,211));
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(0,90,240,70);
        p1.add(b1);
        
        
         b2 = new JButton("Transaction");
          b2.setLayout(null);
        b2.setBackground(new Color(211,211,211));
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(0,160,240,70);
          p1.add(b2);
          
      
            b3 = new JButton("Cards");
          b3.setLayout(null);
        b3.setBackground(new Color(211,211,211));
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(0,230,240,70);
          p1.add(b3);
          
            b4 = new JButton("Fixed/Return Deposite");
          b4.setLayout(null);
        b4.setBackground(new Color(211,211,211));
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setBounds(0,300,240,70);
          p1.add(b4);
          
         
            b5 = new JButton("Investment");
          b5.setLayout(null);
        b5.setBackground(new Color(211,211,211));
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Arial", Font.BOLD, 14));
        b5.setBounds(0,370,240,70);
          p1.add(b5);
          
            b6 = new JButton("Loan");
          b6.setLayout(null);
        b6.setBackground(new Color(211,211,211));
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Arial", Font.BOLD, 14));
        b6.setBounds(0,440,240,70);
          p1.add(b6);
          
            b7 = new JButton("Logout");
          b7.setLayout(null);
        b7.setBackground(new Color(211,211,211));
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("Arial", Font.BOLD, 14));
        b7.setBounds(0,510,240,70);
          p1.add(b7);
          
            b1.addActionListener(this);
        b2.addActionListener(this);  
        b3.addActionListener(this);
        b4.addActionListener(this); 
        b5.addActionListener(this);
        b6.addActionListener(this);  
        b7.addActionListener(this);
          setUndecorated(true);
          setVisible (true);
     
     }
    
    public void actionPerformed(ActionEvent ac)
    {
        if(ac.getSource()==b1)
        {
             new profile("");
            
        }
        else if(ac.getSource()==b2)
        {
            
        }
        else if(ac.getSource()==b3)
        {
            
        }
        else if(ac.getSource()==b4)
        {
           
        }
         else if(ac.getSource()==b5)
        {
            
        
        }
           
        else if(ac.getSource()==b6){
          
        }
         
        else if(ac.getSource()==b7)
        {
          System.exit(0);
           
        }
    }
    public static void main(String arge[])
    {
        new Dashbord(""); 
    } 
    
    
}
