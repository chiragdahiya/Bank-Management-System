package src.bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class SignUp3 extends JFrame {
JRadioButton r1,r2, r3, r4;
    SignUp3(){
         super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(150,5,100,100);
         add(image);

         JLabel l1 = new JLabel("Page 3");
         l1.setFont(new Font("RaLEWAY", Font.BOLD,22));
         l1.setBounds(280,40,400,40);
         add(l1);

         
         JLabel l2 = new JLabel("Account Detials");
         l2.setFont(new Font("RaLEWAY", Font.BOLD,22));
         l2.setBounds(280,70,400,40);
         add(l2);


          
         JLabel l3 = new JLabel("Account Type");
         l3.setFont(new Font("RaLEWAY", Font.BOLD,18));
         l3.setBounds(100,140,200,30);
         add(l3);

        r1 = new JRadioButton("Saving Account");
          r1.setFont(new Font("RaLEWAY", Font.BOLD,14));
         r1.setBounds(100,180,150,30);
         add(r1);


        getContentPane().setBackground(new Color(215,252,252));
         setSize(850, 800);
         setLayout(null);
         setLocation(400,20);
         setVisible(true);


    }

    public static void main(String[] args) {
        new SignUp3();
    }
    
}
