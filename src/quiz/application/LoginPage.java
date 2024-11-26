
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField frame;
    LoginPage()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("viner hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name  = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
        add(name);
        
        frame = new JTextField();
        frame.setBounds(735,200,300,25);
        frame.setFont(new Font("Times new Roman",Font.BOLD,20));
        add(frame);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == rules)
        {
           String name=frame.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == back)
        {
           setVisible(false); 
        }
    }
    public static void main(String args[])
    {
        new LoginPage();
    }
}
