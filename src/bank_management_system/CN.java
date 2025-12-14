package src.bank_management_system;

import java.sql.*;

public class CN {
  Connection connection;
  Statement statement;
    //Consturtor
    public CN(){
        try{
            connection = DriverManager.getConnection("jdbc: mysql://localhost:3306/bankManagement","root","1234");  //need to check password
            statement = connection.createStatement(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
