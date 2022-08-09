import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class Koneksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Koneksi  
{
    Connection cn;
    public static Connection BukaKoneksi(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dbUasAlgo2", "root", "");
           return cn;
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           return null; 
        }   
    }
}