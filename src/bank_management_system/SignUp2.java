package src.bank_management_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp2  extends JFrame implements ActionListener{

 JComboBox comboBox , comboBox2, comboBox3 ;  //se for to add any dropdown
 JTextField textPan, textAadhar;
 JRadioButton r1,r2, e1,e2;
 JButton next;
    String formno;
    SignUp2(String first){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(150,5,100,100);
         add(image);

        this.formno = formno;
   
        JLabel l1 = new JLabel("Page 2 :- ");
        l1.setFont(new Font("Raleway", Font.BOLD ,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additonal Details");
         l2.setFont(new Font("Raleway", Font.BOLD ,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
         l3.setFont(new Font("Raleway", Font.BOLD ,18));
        l3.setBounds(100,120,100,30);
        add(l3);


        String religion[] = { "Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        JLabel l4 = new JLabel("Category : ");
         l4.setFont(new Font("Raleway", Font.BOLD ,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        
        String category[] = { "General","OBC","SC","ST","Other"};
        comboBox = new JComboBox(category);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350,170,320,30);
        add(comboBox);


        
        JLabel l5 = new JLabel("Income : ");
         l5.setFont(new Font("Raleway", Font.BOLD ,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        
        String income[] = { "NULL","<50,000>","<2,50,000>","5,00,000","upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


         JLabel l6 = new JLabel("Edcation : ");
         l6.setFont(new Font("Raleway", Font.BOLD ,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        
        String education[] = { "Non-Graduate","Graduate","Diploma"};
        comboBox3 = new JComboBox(education);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350,270,320,30);
        add(comboBox3);


         JLabel l7 = new JLabel("Occupation : ");
         l7.setFont(new Font("Raleway", Font.BOLD ,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        
        String occupation[] = { "Salaried","Self-Employed","Buisness","Govt.Job"};
        comboBox3 = new JComboBox(occupation);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350,340,320,30);
        add(comboBox3);


         JLabel l8 = new JLabel("PAN no : ");
         l8.setFont(new Font("Raleway", Font.BOLD ,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
         textPan.setFont(new Font("Raleway", Font.BOLD ,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);


         JLabel l9 = new JLabel("Aadhar no : ");
         l9.setFont(new Font("Raleway", Font.BOLD ,18));
        l9.setBounds(100,440,150,30);
        add(l9);

        textAadhar = new JTextField();
         textAadhar.setFont(new Font("Raleway", Font.BOLD ,18));
        textAadhar.setBounds(350, 450,320,30);
        add(textAadhar);

         JLabel l10 = new JLabel("Senior Citizen : ");
         l10.setFont(new Font("Raleway", Font.BOLD ,18));
        l10.setBounds(100,490,150,30);
        add(l10);
       
        r1 = new JRadioButton("yes");
        r1.setFont(new Font("Raleway", Font.BOLD ,14));
        r1.setBounds(350,490,100,30);
        r1.setBackground(new Color(252,208,76));
        add(r1);

        r2 = new JRadioButton("No");
      r2.setFont(new Font("Raleway", Font.BOLD ,14));
        r2.setBounds(460,490,100,30);
       r2.setBackground(new Color(252,208,76));
       add(r2);

       ButtonGroup seniorCitizen = new ButtonGroup();
      seniorCitizen.add(r1);
      seniorCitizen.add(r2);

       JLabel l11 = new JLabel("Exisiting Account : ");
         l11.setFont(new Font("Raleway", Font.BOLD ,18));
        l11.setBounds(100,540,150,30);
        add(l11);
       
       e1 = new JRadioButton("yes");
       e1.setFont(new Font("Raleway", Font.BOLD ,14));
        e1.setBounds(350,540,100,30);
       e1.setBackground(new Color(252,208,76));
       add(e1);

        e2 = new JRadioButton("No");
      e2.setFont(new Font("Raleway", Font.BOLD ,14));
        e2.setBounds(460,540,100,30);
       e2.setBackground(new Color(252,208,76));
       add(e2);
  
       
       ButtonGroup Account = new ButtonGroup();
      Account.add(e1);
      Account.add(e2);

       JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD ,18));
        l12.setBounds(700,10,100,30);
      add(l12);

      JLabel l13 = new JLabel(formno);
         l13.setFont(new Font("Raleway", Font.BOLD ,18));
        l13.setBounds(760,10,60,30);
      add(l13);


    next = new JButton("Next");
   next.setFont(new Font("Raleway",Font.BOLD,14));
  next.setBackground(Color.WHITE);
  next.setForeground(Color.BLACK);
  next.setBounds(570,640,100,30);
  next.addActionListener(this);
  add(next);



        setLayout(null);
setSize(850,750);
setLocation(450,80);
getContentPane().setBackground(new Color(252,208,76));
setVisible(true);
    }

      @Override
      public void actionPerformed(ActionEvent e) {
        
      }
    public static void main(String[] args) {
        new SignUp2(" ");
    }

    
}
