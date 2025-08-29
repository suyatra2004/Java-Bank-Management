package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;
    String formno;

    signup3(String formno) {
        super("Account Details");
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobile-banking.png"));
        Image i2 = i1.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 15, 90, 90);
        add(image);

        JLabel label1 = new JLabel("Page 3");
        label1.setForeground(Color.LIGHT_GRAY);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label1.setBounds(375, 730, 600, 30);
        add(label1);

        JLabel label2 = new JLabel("...ACCOUNT  DETAILS...");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 24));
        label2.setBounds(290, 30, 400, 40);
        add(label2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(150, 130, 200, 30);
        add(l3);

        Color optionBg = new Color(36, 7, 78);

        r1 = new JRadioButton("Saving Account");
        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r1.setBackground(optionBg);
        r1.setBounds(170, 170, 180, 25);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r2.setBackground(optionBg);
        r2.setBounds(370, 170, 220, 25);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setForeground(Color.WHITE);
        r3.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r3.setBackground(optionBg);
        r3.setBounds(170, 200, 180, 25);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setForeground(Color.WHITE);
        r4.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r4.setBackground(optionBg);
        r4.setBounds(370, 200, 260, 25);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setForeground(Color.WHITE);
        l4.setBounds(150, 260, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.PLAIN, 12));
        l5.setForeground(Color.LIGHT_GRAY);
        l5.setBounds(150, 285, 200, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Monospaced", Font.BOLD, 18));
        l6.setForeground(Color.CYAN);
        l6.setBounds(370, 260, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("(Shown on your card/cheque statements)");
        l7.setFont(new Font("Raleway", Font.PLAIN, 12));
        l7.setForeground(Color.LIGHT_GRAY);
        l7.setBounds(370, 285, 300, 20);
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setForeground(Color.WHITE);
        l8.setBounds(150, 330, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Monospaced", Font.BOLD, 18));
        l9.setForeground(Color.CYAN);
        l9.setBounds(370, 330, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.PLAIN, 12));
        l10.setForeground(Color.LIGHT_GRAY);
        l10.setBounds(150, 355, 200, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setForeground(Color.WHITE);
        l11.setBounds(150, 400, 250, 30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(36, 7, 78));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(170,450,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setForeground(Color.WHITE);
        c2.setBackground(new Color(36, 7, 78));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(370,450,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setForeground(Color.WHITE);
        c3.setBackground(new Color(36, 7, 78));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(170,500,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setForeground(Color.WHITE);
        c4.setBackground(new Color(36, 7, 78));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(370,500,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setForeground(Color.WHITE);
        c5.setBackground(new Color(36, 7, 78));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(170,550,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setForeground(Color.WHITE);
        c6.setBackground(new Color(36, 7, 78));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(370,550,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        c7.setForeground(Color.WHITE);
        c7.setBackground(optionBg);
        c7.setBounds(150, 600, 650, 30);
        add(c7);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setForeground(Color.WHITE);
        l12.setBounds(700, 10, 80, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setForeground(Color.CYAN);
        l13.setBounds(770, 10, 60, 30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(new Color(2, 31, 64));
        s.setForeground(Color.WHITE);
        s.setBounds(220, 670, 120, 35);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(new Color(73, 1, 10));
        c.setForeground(Color.WHITE);
        c.setBounds(450, 670, 120, 35);
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new Color(36, 7, 78));
        setSize(850, 800);
        setUndecorated(true);
        setLayout(null);
        setLocation(400, 20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype="";
        if(r1.isSelected()){
            atype=atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype ="Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran= new Random();
        long first7=ran.nextInt(90000000)+1409963000000000L;
        String cardno=""+first7;
        long first3=ran.nextInt(9000)+1000;
        String pin=""+first3;

        String fac="";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"Email Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }
        try{
            if(e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the details");

                }else{
                    conn c1=new conn();
                    String q1="insert into signupthree values ('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number:"+cardno+"\n Pin:"+pin);
                     //new deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    

    public static void main(String[] args) {
        new signup3("");
    }
}