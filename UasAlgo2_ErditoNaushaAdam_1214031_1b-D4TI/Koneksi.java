import java.sql.*;

/**
 * Write a description of class Koneksi here.
 * 
 * @author (Erdito) 
 * @version (a version number or a date)
 */

public class Koneksi  
{
    public  static String a = "";
    
    public Koneksi()
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbUasAlgo2";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            String query = "SELECT * FROM `arah` WHERE `id` = 1";
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet kunci = stmt.executeQuery(query); 
                
                while(kunci.next()){                   
                    a = kunci.getString("kunci");
                }  
                
            } catch (SQLException e) {
                a="Gagal";
                System.out.println(e);
            }
            

        } catch (ClassNotFoundException e) {
            a="Gagal";
            System.out.println(e);
        }//end try catch
    }
    
    public static String sampleMethod()
    {
        // put your code here
        return a;
    }
}
    


