import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
