import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        preparaMundo();
    }
    
    private void preparaMundo(){
        addObject(new Fondo(),300,200);
        addObject(new Play(),300,200);
        addObject(new Controls(),300,250);
        addObject(new Records(),300,300);
        addObject(new Exit(),300,350);
    }
    
    public void act(){
        Greenfoot.playSound("jungle.mp3");
    }
}
