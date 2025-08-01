package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton jButton1, jButton2, jButton3;
   //constructor//
   login(){
       super("Bank Management System");

       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));//store image from system to i1
       Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//scaling the image
       ImageIcon i3=new ImageIcon(i2);//image visible on frame.for visibility we need JLabel
       JLabel image= new JLabel(i3);
       image.setBounds(250,10,90,95);
       add(image);

       label1=new JLabel("WELCOME TO ATM");
       label1.setForeground(Color.WHITE);
       label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
       label1.setBounds(195, 125, 450, 40);
         add(label1);

       label2=new JLabel("Card No:");
       label2.setForeground(Color.WHITE);
       label2.setFont(new Font("Raleway", Font.BOLD , 18));
       label2.setBounds(150, 190, 375, 30);
       add(label2);

       textField2=new JTextField(15);
       textField2.setFont(new Font("Arial",Font.BOLD,14));
       textField2.setBounds(240,190,210,30);
       add(textField2);

       label3=new JLabel("Pin No:");
       label3.setForeground(Color.WHITE);
       label3.setFont(new Font("Ralway", Font.BOLD , 18));
       label3.setBounds(150, 250, 375, 30);
       add(label3);

       passwordField3 = new JPasswordField(15);
       passwordField3.setBounds(240,250,210,30);
       passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
       add(passwordField3);

       jButton1=new JButton("Sign In");
       jButton1.setBounds(130,300,95,20);
       jButton1.setFont(new Font("Ralway", Font.BOLD , 12));
       jButton1.setForeground(Color.WHITE);
       jButton1.setBackground(Color.blue);
       jButton1.addActionListener(this);
       add(jButton1);

       jButton2=new JButton("Clear");
       jButton2.setBounds(280,300,95,20);
       jButton2.setFont(new Font("Ralway", Font.BOLD , 12));
       jButton2.setForeground(Color.WHITE);;
       jButton2.setBackground(new Color(54, 72, 224));
       jButton2.addActionListener(this);
       add(jButton2);

       jButton3=new JButton("Sign Up");
       jButton3.setBounds(430,300,95,20);
       jButton3.setFont(new Font("Ralway", Font.BOLD , 12));
       jButton3.setForeground(Color.WHITE);
       jButton3.setBackground(Color.blue);
       jButton3.addActionListener(this);
       add(jButton3);

       ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
       Image ii2 = ii1.getImage().getScaledInstance(650,380,Image.SCALE_DEFAULT);
       ImageIcon ii3 = new ImageIcon(ii2);
       JLabel iimage = new JLabel(ii3);
       iimage.setBounds(0,0,650,380);
       add(iimage);



       setLayout(null);//default layout is boarder-layout
       setSize(650,380);
       setUndecorated(true);
        setLocation(450,200);//center the login form
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==jButton1){
                conn c=new conn();
                  String  cardno=textField2.getText();
                  String pin=passwordField3.getText();
                String q = "select * from login where card_number='" + cardno + "' and pin='" + pin + "'";

                ResultSet resultSet=c.statement.executeQuery(q);//remove the  data

             if(resultSet.next()){
                 setVisible(false);
                 new mainc(pin);
             }else {
                 JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
             }

            }else if (e.getSource() == jButton2){
                textField2.setText("");
                passwordField3.setText("");
            }else if (e.getSource() == jButton3){
                    new signup();
                       setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }


    public static void main(String[] args) {
            new login();  //object

    }
}





























