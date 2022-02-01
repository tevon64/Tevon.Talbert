import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class connect {
    public static void main(String[] args) {
     String url = "jdbc:postgresql://database-3.clzirnqm0xdy.us-east-2.rds.amazonaws.com";
     String user = "postgres";
     String password = "Rammstein1";
    	  Connection conn = null;
          try {
              conn = DriverManager.getConnection(url, user, password);
              System.out.println("Connected to the PostgreSQL server successfully.");
              Statement statement = conn.createStatement();
             String sql2 =  "INSERT INTO Request(RID,cashamount, reason) VALUES (0001, '50000', 'bowling')";
             statement.executeUpdate(sql2);
            
             
              
            	  
                
                  
              
              
          } catch (SQLException e) {
              System.out.println(e.getMessage());
          }

          return;
      }	
    	
    }
    
    
    