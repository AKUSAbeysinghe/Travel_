
package travel;

import java.sql.*;

public class Conn {
    
    Connection c;
  Conn(){
  
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql:///");
          
      } catch (Exception e) {
          e.printStackTrace();
      }
  
  }  
    
}

