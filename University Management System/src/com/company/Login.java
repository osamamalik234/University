package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JFrame frame;
    ImageIcon image;
    JLabel backgroundImage;
    JLabel userName , password;
    JTextField userTxt;
    JPasswordField passTxt;
    JButton b1 , b2;
    Container c;
     Login() {
        setTitle("Login Page");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        c = getContentPane();
        c.setLayout(null);

        image = new ImageIcon("C:\\Users\\j c\\IdeaProjects\\University Management System\\Picture\\admin.jpg");

         Image img = image.getImage();
         Image imgtemp = img.getScaledInstance(700,600,Image.SCALE_SMOOTH);
         image = new ImageIcon(imgtemp);

         backgroundImage = new JLabel("" , image,JLabel.CENTER);
         backgroundImage.setBounds(0,0,700,600);

         Font font = new Font("Cambria", Font.BOLD, 20);

         userName = new JLabel("User Name: ");
         userName.setBounds(100 , 100 , 120 , 30);
         userName.setFont(font);

         userTxt = new JTextField();
         userTxt.setBounds(300,100 , 250 , 30);
         userName.setFont(font);


         password = new JLabel("Password: ");
         password.setBounds(100 , 200 , 120 , 30);
         password.setFont(font);

         passTxt = new JPasswordField();
         passTxt.setBounds(300 , 200 , 250 , 30);
         passTxt.setFont(font);

         b1 = new JButton("Login");
         b1.setBounds(180 , 330 , 100 , 30);
         b1.setFont(font);
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.white);
         b1.addActionListener(this);
         b1.setFocusable(false);

         b2 = new JButton("Clear");
         b2.setBounds(350 , 330 , 100 , 30);
         b2.setFont(font);
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.white);
         b2.addActionListener(this);
         b2.setFocusable(false);

         c.add(userName);
         c.add(password);
         c.add(userTxt);
         c.add(passTxt);
         c.add(b1);
         c.add(b2);
         c.add(backgroundImage);

         setResizable(false);
         setVisible(true);
    }

    private ImageIcon getImage() {
        return image;
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1) {

             String userName = userTxt.getText();
             String password = passTxt.getText();
             if(userName.equals("Admin") && password.equals("muet20")) {
                 // JOptionPane.showMessageDialog(null , "User Name: "+userName+"\n\nPassword: "+password);
                 new FrontPage();
                 setVisible(false);

             }
             else
                 JOptionPane.showMessageDialog(null ,"Invalid login.....");
         }

         else {
             if(e.getSource()==b2) {
               userTxt.setText("");
               passTxt.setText("");
             }
         }
    }
}
