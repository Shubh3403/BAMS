package bankingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.util.regex.*;

public class Signup extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15,l0;
    JTextField t1, t2, t3, t4, t5, t6, t7,t0;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b, b1;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup() {

        setTitle("NEW ACCOUNT APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankingsystem/icons/form.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l16 = new JLabel(i3);
        l16.setBounds(0, 0, 1000, 950);
        add(l16);

        l1 = new JLabel("APPLICATION FORM NO. " + first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setForeground(Color.orange);

        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setForeground(Color.yellow);

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l0 = new JLabel("Last Name:");
        l0.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Email ID:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setForeground(Color.white);
        l12.setBounds(100, 590, 200, 30);
        l16.add(l12);

        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 14));

        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 14));

        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 14));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));

         t0 = new JTextField();
        t0.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));

        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));

        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
         t7.setBounds(300, 590, 400, 30);
        l16.add(t7);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b1 = new JButton("BACK");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.CYAN);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.CYAN);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.CYAN);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.CYAN);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.CYAN);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);

        setLayout(null);
        
        l1.setBounds(140, 20, 600, 40);
        l16.add(l1);

        l2.setBounds(290, 80, 600, 30);
        l16.add(l2);
        
        l3.setForeground(Color.white);
        l3.setBounds(100, 140, 100, 30);
        l16.add(l3);
        
      
        t1.setBounds(300, 140, 400, 30);
        l16.add(t1);
        
        l4.setForeground(Color.white);
        l4.setBounds(100, 190, 200, 30);
        l16.add(l4);

        t2.setBounds(300, 190, 400, 30);
        l16.add(t2);

        l0.setForeground(Color.white);
        l0.setBounds(100, 240, 200, 30);
        l16.add(l0);
        
        t0.setBounds(300, 240, 400, 30);
        l16.add(t0);
        
        l5.setForeground(Color.white);
        l5.setBounds(100, 290, 200, 30);
        l16.add(l5);
        
        dateChooser.setBounds(300, 290, 400, 30);
        l16.add(dateChooser);

        l6.setForeground(Color.white);
        l6.setBounds(100, 340, 200, 30);
        l16.add(l6);

        r1.setBounds(300, 340, 60, 30);
        l16.add(r1);

        r2.setBounds(450, 340, 90, 30);
        l16.add(r2);

        l7.setForeground(Color.white);
        l7.setBounds(100, 390, 200, 30);
        l16.add(l7);

        t3.setBounds(300, 390, 400, 30);
        l16.add(t3);

        l8.setForeground(Color.white);
        l8.setBounds(100, 440, 200, 30);
        l16.add(l8);

        r3.setBounds(300, 440, 100, 30);
        l16.add(r3);

        r4.setBounds(450, 440, 100, 30);
        l16.add(r4);

        r5.setBounds(620, 440, 80, 30);
        l16.add(r5);

        l9.setForeground(Color.white);
        l9.setBounds(100, 490, 200, 30);
        l16.add(l9);

        t4.setBounds(300, 490, 400, 30);
        l16.add(t4);

        l10.setForeground(Color.white);
        l10.setBounds(100, 540, 200, 30);
        l16.add(l10);

        t5.setBounds(300, 540, 400, 30);
        l16.add(t5);

        l11.setForeground(Color.white);
        l11.setBounds(100, 630, 200, 30);
        l16.add(l11);

        t6.setBounds(300, 630, 400, 30);
        l16.add(t6);
        
        b.setBounds(620, 670, 80, 30);
        l16.add(b);
        
        b1.setBounds(500, 670, 80, 30);
        l16.add(b1);
                     
        b.addActionListener(this);
        b1.addActionListener(this);

        setSize(800, 800);
        setLocation(300, 0);
        setUndecorated(true);  
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b){
        String formno = first;
        String name = t1.getText();
        String fname = t2.getText();
        String lname=t0.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = t3.getText();
        String marital = null;
        if (r3.isSelected()) {
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }

        String address = t4.getText();
        String city = t5.getText();
        String pincode = t6.getText();
        String state = t7.getText();

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
        } else {
            try {

                if (t6.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + name + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                    c1.s.executeUpdate(q1);

                    new Signup2(first).setVisible(true);
                    setVisible(false);
                }        
          
        }catch(Exception e){
             e.printStackTrace();
        }
            }

        }
else
{ setVisible(false);
 new Login();
}
    }
    
    

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+\\.com)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
