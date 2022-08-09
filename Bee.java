import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     Connection cn = Koneksi.BukaKoneksi();
     tampil_data();
     keycontrol();
    }
    
    public void tampil_data(){
        try{
            String sql = "SELECT * FROM dbuasalgo2";
            java.sql.Connection conn = (Connection)Koneksi.BukaKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                res.getString("kunci database: "+res.getString(1));
            }
        }catch (Exception e){
            
        }
    }
    
    public void keycontrol()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+5);
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-5);
        }
    }
}
