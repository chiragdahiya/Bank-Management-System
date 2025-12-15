package src.bank_management_system;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SignUp2  extends JFrame{

 JComboBox comboBox , comboBox2, comboBox3 ;  //se for to add any dropdown

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
        l8.setBounds(100,420,150,30);
        add(l8);

        
       













        setLayout(null);
setSize(850,750);
setLocation(450,80);
getContentPane().setBackground(new Color(252,208,76));
setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp2(" ");
    }

    
}
