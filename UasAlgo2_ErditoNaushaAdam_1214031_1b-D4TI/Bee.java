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
     String s = Koneksi.sampleMethod();
     getWorld().showText("Nilai Dari Database = " + s, 120, 30);
     KendaliArah(s);
     s = String.valueOf(s);
    }
    
    private void KendaliArah(String s){
        if (s.equals("w")){
             setLocation(getX(), getY()-1);
        }
        if (s.equals("a")){
             setLocation(getX()-1, getY());
        }
        if (s.equals("s")){
             setLocation(getX(), getY()+1);
        }
        if (s.equals("d")){
             setLocation(getX()+1, getY());
        }
    }
}
