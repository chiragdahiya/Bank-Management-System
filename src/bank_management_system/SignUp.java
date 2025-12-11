package src.bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener {

    //radio buttons
    JRadioButton r1 , r2 ,m1,m2,m3;

    JButton Next;

  JTextField textName, textFname , textEmail, textMS, textAdd, textCity, textPin, textState;

  JDateChooser  dateChooser;

  Random ran = new Random();
  long first4 = (ran.nextLong()% 9000L) + 1000L;

  String first = " " + Math.abs(first4);

    //constructor
    SignUp(){
         super("Application Form");

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(25,10,100,100);
         add(image);

        JLabel label1 = new JLabel("Application Form No:" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

      
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

      textName = new JTextField();
      textName.setFont(new Font("Raleway",Font.BOLD,14));
      textName.setBounds(300,190,400,30);
      add(textName);


      
       JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);




      textFname = new JTextField();
      textFname.setFont(new Font("Raleway",Font.BOLD,14));
      textFname.setBounds(300,240,400,30);
      add(textFname);
  
      
        //D.O.B
       JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);
     
        //Calender
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG); 

        //radio buttons
      r1 = new JRadioButton("Male");
      r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
      r1.setBounds(300,290,60,30);
      add(r1);

      r2 = new JRadioButton("Female");
      r2.setFont(new Font("Raleway", Font.BOLD,14));
      r2.setBackground(new Color(222,255,228));
      r2.setBounds(450,290,90,30);
      add(r2);
      //group radio button so only one select at a time
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(r1);
      buttonGroup.add(r2);

      JLabel labelEmail = new JLabel("Emal :");
      labelEmail.setFont(new Font("raleway",Font.BOLD,20));
      labelEmail.setBounds(100,390,200,30);
      add(labelEmail);

         textEmail = new JTextField();
      textEmail.setFont(new Font("Raleway",Font.BOLD,14));
      textEmail.setBounds(300,390,400,30);
      add(textEmail);

      
      JLabel labelMS = new JLabel("Married Status :");
      labelMS.setFont(new Font("raleway",Font.BOLD,20));
      labelMS.setBounds(100,440,200,30);
      add(labelMS);

        m1 = new JRadioButton("Married");
      m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
      m1.setBounds(300,440,100,30);
      add(m1);

      m2 = new JRadioButton("Unmarried");
      m2.setFont(new Font("Raleway", Font.BOLD,14));
      m2.setBackground(new Color(222,255,228));
      m2.setBounds(450,440,100,30);
      add(m2);

         m3 = new JRadioButton("Other");
      m3.setFont(new Font("Raleway", Font.BOLD,14));
      m3.setBackground(new Color(222,255,228));
      m3.setBounds(630,440,100,30);
      add(m3);
      //group radio button so only one select at a time
      ButtonGroup marriedGroup = new ButtonGroup();
      marriedGroup.add(m1);
      marriedGroup.add(m2);
      marriedGroup.add(m3);

        
      JLabel labeladdress = new JLabel("Address:");
      labeladdress.setFont(new Font("raleway",Font.BOLD,20));
      labeladdress.setBounds(100,490,200,30);
      add(labeladdress);

      textAdd = new JTextField();
      textAdd.setFont(new Font("Raleway",Font.BOLD,14));
      textAdd.setBounds(300,490,400,30);
      add(textAdd);


       JLabel labelcity = new JLabel("City:");
      labelcity.setFont(new Font("raleway",Font.BOLD,20));
      labelcity.setBounds(100,540,200,30);
      add(labelcity);

      textCity = new JTextField();
      textCity.setFont(new Font("Raleway",Font.BOLD,14));
      textCity.setBounds(300,540,400,30);
      add(textCity);

      
       JLabel labelPin = new JLabel("Pin Code :");
      labelPin.setFont(new Font("raleway",Font.BOLD,20));
      labelPin.setBounds(100,590,200,30);
      add(labelPin);

      textPin = new JTextField();
      textPin.setFont(new Font("Raleway",Font.BOLD,14));
      textPin.setBounds(300,590,400,30);
      add(textPin);

      JLabel labelState = new JLabel("State :");
      labelState.setFont(new Font("raleway",Font.BOLD,20));
      labelState.setBounds(100,640,200,30);
      add(labelState);

      textState = new JTextField();
      textState.setFont(new Font("Raleway",Font.BOLD,14));
      textState.setBounds(300,640,400,30);
      add(textState);


      Next = new JButton("Next");
      Next.setFont(new Font("RALEWAY",Font.BOLD,14));
      Next.setBackground(Color.BLACK);
      Next.setForeground(Color.WHITE);
      Next.setBounds(620,710,80,30);
      Next.addActionListener(this);
      add(Next);

        getContentPane().setBackground(new Color(222,255,228));    //to set color use getContentPane
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }
  
@Override
public void actionPerformed(ActionEvent e) {
  
    
}

   //main function
    public static void main(String[] args) {
        
        //object
        new SignUp();
    }
    
}
