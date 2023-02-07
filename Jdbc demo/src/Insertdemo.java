import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class Insertdemo {
  public static void main(String[] args) {
    Connection connection = null;
    Statement stmt = null;
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "sample");
       System.out.println("insert successfully");
      stmt = connection.createStatement();
      stmt.execute("Insert into insert1 (id,name,email) values (5,'Lokesh','sum@gmail.com'),(4,'nithi','sd@gmail.com')");
      
    } 
    catch (Exception e) {
      e.printStackTrace();
    }finally {
      try {
        stmt.close();
        connection.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

