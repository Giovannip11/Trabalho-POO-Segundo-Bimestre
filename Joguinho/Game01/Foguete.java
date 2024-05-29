import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foguete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foguete extends Actor
{
    /**
     * Act - do whatever the Foguete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
        if(Greenfoot.isKeyDown("right")){
           move(2); 
        }
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
    }
}
