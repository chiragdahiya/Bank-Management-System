package src.bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;  //gloablly declare
    JTextField textField2;
    JPasswordField passwordField3;
    JButton btn1, btn2, btn3;


    //Constructor
    Login(){
        super("Bank Management System");   //calls the parent to addd title (parent  = class login via JFRAME)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icon/bank.png")); //from system memory now it stores in i1
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);  // to make image of proper size
        ImageIcon i3= new ImageIcon(i2);


         //image can't simply pass into frame to make it visible on frame need jlable
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100,100); // where should image be visble , for that we need setBounds
        add(image);  //jlable image is passed

        
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("src/icon/card.png"));
        Image j2 = j1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel img  = new JLabel(j3);
        img.setBounds(630,350,100,100);
        add(img);


       label1 = new JLabel("WELCOME TO ATM");
       label1.setForeground(Color.WHITE);
       label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
       label1.setBounds(230,125,450,40);
       add(label1);

      label2 = new JLabel("CARD No:");
      label2.setFont(new Font("Ralway", Font.BOLD,28));
     label2.setForeground(Color.white);
     label2.setBounds(150,190,375,30);
     add(label2);


     textField2 = new JTextField(15);
     textField2.setBounds(325,190,230,30);
     textField2.setFont(new Font("Arial",Font.BOLD,14));
     add(textField2);



     label3 = new JLabel("PIN:");
     label3.setForeground(Color.WHITE);
     label3.setFont(new Font("RaLWAY",Font.BOLD,28));
     label3.setBounds(150,250,375,30);
     add(label3);

     passwordField3 = new JPasswordField(15);
     passwordField3.setBounds(325,250,230,30);
     passwordField3.setFont(new Font("Arial",Font.BOLD,14));
     add(passwordField3);

     btn1 = new JButton("SIGN IN");

     btn1.setFont(new Font("Arial",Font.BOLD, 14));
     btn1.setForeground(Color.white);
     btn1.setBackground(Color.black);
     btn1.setBounds(300,300,100,30);
     btn1.addActionListener(this);
    add(btn1);

     btn2= new JButton("CLEAR");
     btn2.setFont(new Font("Arial",Font.BOLD, 14));
     btn2.setForeground(Color.white);
     btn2.setBackground(Color.BLACK);
     btn2.setBounds(430,300,100,30);
     btn2.addActionListener(this);
    add(btn2);


       btn3= new JButton("SIGN UP");
     btn3.setFont(new Font("Arial",Font.BOLD, 14));
     btn3.setForeground(Color.white);
     btn3.setBackground(Color.BLACK);
     btn3.setBounds(300,350,230,30);
     btn3.addActionListener(this);
    add(btn3);



        ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("src/icon/backbg.png"));
        Image m2 = m1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon m3 = new ImageIcon(m2);
        JLabel imgs  = new JLabel(m3);
        imgs.setBounds(0,0,850,480);
        add(imgs);

       //frame layout - bydefault it is null
        setLayout(null);
       
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }

@Override
public void actionPerformed(ActionEvent e) {   //this will perform the tasdk for button
   try{
    if(e.getSource() == btn1){  //e will see yes btn1 is there and will perform its task 
   
    }else if(e.getSource() == btn2){
        textField2.setText("");
        passwordField3.setText("");

    }else if(e.getSource() == btn3){


    }

   }catch(Exception E){
    E.printStackTrace(); 

   }
    
}
// main function
    public static void main(String[] args) {
        //objrct
        new Login();
    }

    
}
