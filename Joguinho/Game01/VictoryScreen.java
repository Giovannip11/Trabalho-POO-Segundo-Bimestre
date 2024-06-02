import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VictoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryScreen extends MyWorld
{

    /**
     * Constructor for objects of class VictoryScreen.
     * 
     */
    public VictoryScreen()
    {
         GreenfootImage background = new GreenfootImage(800, 600);
        background.setColor(Color.BLACK);
        background.drawString("Você Venceu", 330, 300);
        setBackground(background);
    }
}
