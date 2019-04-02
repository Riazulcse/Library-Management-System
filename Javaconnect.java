import java.sql.*;
import javax.swing.JOptionPane;


public class Javaconnect {
    Connection conn;

    /**
     *
     * @return
     */
    public static Connection ConnecrDB(){
   try{ Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\SOlve of code\\java code solve\\LibraryManagementSystem\\LibraryNew.sqlite");
    return conn;
    
    }catch(Exception e)
    {
   JOptionPane.showMessageDialog(null,e);
   return null;
    }
    }
}
