package bankingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;
    String formno;
    Signup2(String formno){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/form.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(0,0, 1000, 950);
        add(l14);
        
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: ADDITIONAL DETAILS");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setForeground(Color.orange);
        
        l2 = new JLabel("Religion:");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Category:");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("Income:");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("Educational");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Qualification:");
        l11.setForeground(Color.white);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l6 = new JLabel("Occupation:");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l7 = new JLabel("PAN Number:");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("Aadhar Number:");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l9 = new JLabel("Senior Citizen:");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l10 = new JLabel("Existing Account:");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 15));
        l12.setForeground(Color.YELLOW);
        
        l13 = new JLabel(formno);
        l13.setForeground(Color.yellow);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.CYAN);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.CYAN);
        
        
        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(r1);
        seniorcitizen.add(r2);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.CYAN);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.CYAN);
        
        
        ButtonGroup customer = new ButtonGroup();
        customer.add(r3);
        customer.add(r4);
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
       
        
        setLayout(null);
        
        
        l12.setBounds(680,10,200,30);
        l14.add(l12);
        
        l13.setBounds(760,10,60,30);
        l14.add(l13);
        
        l1.setBounds(200,30,600,40);
        l14.add(l1);
        
        l2.setBounds(100,120,100,30);
        l14.add(l2);
        
        c1.setBounds(350,120,320,30);
        l14.add(c1);
        
        l3.setBounds(100,170,100,30);
        l14.add(l3);
        
        c2.setBounds(350,170,320,30);
        l14.add(c2);
        
        l4.setBounds(100,220,100,30);
        l14.add(l4);
        
        c3.setBounds(350,220,320,30);
        l14.add(c3);
        
        l5.setBounds(100,270,150,30);
        l14.add(l5);
        
        c4.setBounds(350,270,320,30);
        l14.add(c4);
        
        l11.setBounds(100,290,150,30);
        l14.add(l11);
        
        l6.setBounds(100,340,150,30);
        l14.add(l6);
        
        c5.setBounds(350,340,320,30);
        l14.add(c5);
        
        l7.setBounds(100,390,150,30);
        l14.add(l7);
        
        t1.setBounds(350,390,320,30);
        l14.add(t1);
        
        l8.setBounds(100,440,180,30);
        l14.add(l8);
        
        t2.setBounds(350,440,320,30);
        l14.add(t2);
        
        l9.setBounds(100,490,150,30);
        l14.add(l9);
        
        r1.setBounds(350,490,100,30);
        l14.add(r1);
        
        r2.setBounds(460,490,100,30);
        l14.add(r2);
        
        l10.setBounds(100,540,180,30);
        l14.add(l10);
        
        r3.setBounds(350,540,100,30);
        l14.add(r3);
        
        r4.setBounds(460,540,100,30);
        l14.add(r4);
        
        b.setBounds(570,630,100,30);
        l14.add(b);
        
        b.addActionListener(this);
        
        
        
        setSize(850,750);
        setLocation(300,0);
        setVisible(false);
        setUndecorated(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t1.getText();
        String aadhar = t2.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
         if (!isValidPanCardNumber(pan)) 
            {
                    JOptionPane.showMessageDialog(null, "Please enter a valid PAN number.");
            }
         else if (!isValidAadharCardNumber(aadhar)) 
            {
                    JOptionPane.showMessageDialog(null, "Please enter a valid AADHAR number.");
            }
         
         else{
        
             try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }}
    
               
    }
    
    private boolean isValidPanCardNumber(String panCardNumber)
    {
    String panCardRegex = "^[A-Z]{5}\\d{4}[A-Z]$";
    return panCardNumber.matches(panCardRegex);
    }
    
    private boolean isValidAadharCardNumber(String aadharCardNumber)
    {
    
    String aadharCardRegex = "^[0-9]{12}$";
    return aadharCardNumber.matches(aadharCardRegex);
    }
  
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}
