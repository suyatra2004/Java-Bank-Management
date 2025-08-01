package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    Random ran = new Random();
    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin;
    JDateChooser dateChooser;
    long first4 = ran.nextInt(9000) + 1000;
    String first = " " + first4;

    signup() {
        super("APPLICATION FORM");

        Font mainFont = new Font("Segoe UI", Font.BOLD, 16);
        Font titleFont = new Font("Segoe UI", Font.BOLD, 30);
        Font headingFont = new Font("Segoe UI", Font.BOLD, 22);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobile-banking.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 88, 95);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setForeground(Color.WHITE);
        label1.setFont(titleFont);
        label1.setBounds(200, 20, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setForeground(Color.LIGHT_GRAY);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label2.setBounds(390, 730, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("...Personal Details...");
        label3.setForeground(Color.WHITE);
        label3.setFont(headingFont);
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setForeground(Color.WHITE);
        labelName.setFont(mainFont);
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(mainFont);
        textName.setBounds(300, 190, 400, 34);
        textName.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setForeground(Color.WHITE);
        labelfName.setFont(mainFont);
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(mainFont);
        textFname.setBounds(300, 240, 400, 34);
        textFname.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textFname);

        JLabel labelG = new JLabel("Gender :");
        labelG.setForeground(Color.WHITE);
        labelG.setFont(mainFont);
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(mainFont);
        r1.setBackground(new Color(3, 7, 75));
        r1.setForeground(Color.WHITE);
        r1.setBounds(300, 290, 80, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(3, 7, 75));
        r2.setForeground(Color.WHITE);
        r2.setFont(mainFont);
        r2.setBounds(400, 290, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setForeground(Color.WHITE);
        DOB.setFont(mainFont);
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        dateChooser.setFont(mainFont);
        dateChooser.setBackground(Color.WHITE);
        add(dateChooser);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(mainFont);
        labelEmail.setForeground(Color.WHITE);
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(mainFont);
        textEmail.setBounds(300, 390, 400, 30);
        textEmail.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(mainFont);
        labelMs.setForeground(Color.WHITE);
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(3, 7, 75));
        m1.setForeground(Color.WHITE);
        m1.setFont(mainFont);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(3, 7, 75));
        m2.setForeground(Color.WHITE);
        m2.setBounds(420, 440, 120, 30);
        m2.setFont(mainFont);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(3, 7, 75));
        m3.setForeground(Color.WHITE);
        m3.setBounds(550, 440, 100, 30);
        m3.setFont(mainFont);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(mainFont);
        labelAdd.setForeground(Color.WHITE);
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(mainFont);
        textAdd.setBounds(300, 490, 400, 34);
        textAdd.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(mainFont);
        labelCity.setForeground(Color.WHITE);
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(mainFont);
        textcity.setBounds(300, 540, 400, 30);
        textcity.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(mainFont);
        labelPin.setForeground(Color.WHITE);
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(mainFont);
        textPin.setBounds(300, 590, 400, 30);
        textPin.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(mainFont);
        labelstate.setForeground(Color.WHITE);
        labelstate.setBounds(100, 640, 200, 30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(mainFont);
        textState.setBounds(300, 640, 400, 30);
        textState.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(new Color(13, 2, 46, 255));
        next.setForeground(Color.WHITE);

        next.setBounds(700, 700, 98, 35);

        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(3, 7, 75));
        setLayout(null);
        setSize(850, 800);
        setUndecorated(true);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the details");

            } else {
                conn c = new conn();//database object
                String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "', '" + address + "', '" + city + "','" + pincode + "','" + state + "')";
                c.statement.executeUpdate(q);//execute the query
                new signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signup();
    }
}