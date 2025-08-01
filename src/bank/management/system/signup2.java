package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signup2 extends JFrame implements ActionListener {

    String formno;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;
    JButton next;

    signup2(String formno) {
        super("APPLICATION FORM");

        this.formno = formno;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobile-banking.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 88, 95);
        add(image);

        JLabel label1 = new JLabel("Page 2");
        label1.setForeground(Color.LIGHT_GRAY);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label1.setBounds(390, 730, 600, 30);
        add(label1);

        JLabel label2 = new JLabel("...ADDITIONAL  DETAILS...");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 22));
        label2.setBounds(300, 20, 800, 60);
        add(label2);

        // Religion
        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100, 150, 100, 30);
        add(l3);

        String religion[] = {"<--Select Religion-->", "Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(300, 150, 420, 30);
        comboBox.setBackground(Color.WHITE);
        add(comboBox);

        // Category
        JLabel l4 = new JLabel("Category : ");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 200, 100, 30);
        add(l4);

        String Category[] = {"<--Select Category-->", "General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<>(Category);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(300, 200, 420, 30);
        comboBox2.setBackground(Color.WHITE);
        add(comboBox2);

        // Income
        JLabel l5 = new JLabel("Income : ");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 250, 100, 30);
        add(l5);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Up to 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(300, 250, 420, 30);
        comboBox3.setBackground(Color.WHITE);
        add(comboBox3);

        // Educational
        JLabel l6 = new JLabel("Educational : ");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 300, 150, 30);
        add(l6);

        String educational[] = {"<--Select-->","Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox<>(educational);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(300, 300, 420, 30);
        comboBox4.setBackground(Color.WHITE);
        add(comboBox4);

        // Occupation
        JLabel l7 = new JLabel("Occupation : ");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 350, 150, 30);
        add(l7);

        String Occupation[] = {"<--Select-->","Service", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox<>(Occupation);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(300, 350, 420, 30);
        comboBox5.setBackground(Color.WHITE);
        add(comboBox5);

        // PAN Number
        JLabel l8 = new JLabel("PAN Number : ");
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 400, 150, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(300, 400, 420, 30);
        add(textPan);

        // Aadhar Number
        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 450, 180, 30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAadhar.setBounds(300, 450, 420, 30);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 500, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(98, 52, 237));
        r1.setBounds(300, 500, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(98, 52, 237));
        r2.setBounds(450, 500, 100, 30);
        add(r2);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account : ");
        l11.setForeground(Color.WHITE);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 550, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setForeground(Color.WHITE);
        e1.setBackground(new Color(98, 52, 237));
        e1.setBounds(300, 550, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setForeground(Color.WHITE);
        e2.setBackground(new Color(98, 52, 237));
        e2.setBounds(450, 550, 100, 30);
        add(e2);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(e1);
        accountGroup.add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setForeground(Color.WHITE);
        l12.setFont(new Font("Raleway", Font.BOLD|Font.ITALIC,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setForeground(Color.white);

        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(770,10,60,30);
        add(l13);
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(new Color(187, 173, 241, 255));
        next.setForeground(Color.BLACK);

        next.setBounds(700, 680, 98, 35);

        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(98, 52, 237));
        setSize(850, 800);
        setUndecorated(true);
        setLocation(360, 40);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String addhar = textAadhar.getText();
        String sc=null;
        if(r1.isSelected()){
            sc="Yes";
        } else if (r2.isSelected()) {
            sc="No";

        }
        String eAccount = null;
        if (r1.isSelected()){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }
        try {
            if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the details");

            } else {
                conn c1 = new conn();
                String q = "insert into signuptwo values('" + formno + "','" + rel + "','" + cat + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "', '" + addhar + "', '" + sc + "','" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();

        }

    }

        public static void main(String[] args) {
        new signup2("");
    }
}
