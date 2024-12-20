import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gab?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           
            return con;
            
            
            
        }catch(Exception e){
            
        }
        
        
        
        return null;
    }
}
