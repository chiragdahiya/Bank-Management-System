package src.bank_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CN {
  Connection connection;
  Statement statement;
    //Consturtor
    public CN(){
        try{
            connection = DriverManager.getConnection("jdbc: mysql://localhost:3306/bankSystem","root","12345");  //need to check password
            statement = connection.createStatement(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
