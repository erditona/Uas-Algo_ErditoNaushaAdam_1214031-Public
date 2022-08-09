import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
/**
 * Write a description of class Bee here.
 * 
 * @author (Erdito) 
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
     Koneksi Koneksi = new Koneksi();
     String ka = Koneksi.sampleMethod();
     getWorld().showText("Nilai Dari Database = " + ka, 120, 30);
     KendaliArah(ka);
     ka = String.valueOf(ka);
    }
    
    private void KendaliArah(String ka){
        if (ka.equals("w")){
             setLocation(getX(), getY()-1);
        }
        if (ka.equals("a")){
             setLocation(getX()-1, getY());
        }
        if (ka.equals("s")){
             setLocation(getX(), getY()+1);
        }
        if (ka.equals("d")){
             setLocation(getX()+1, getY());
        }
    }
}
