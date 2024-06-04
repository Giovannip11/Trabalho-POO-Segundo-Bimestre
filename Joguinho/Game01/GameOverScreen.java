import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends MyWorld
{

    
    public GameOverScreen()
    {
      

        GreenfootImage background = new GreenfootImage(800, 600);
        background.setColor(Color.BLACK);
        background.drawString("Fim de Jogo, Voce perdeu!!!", 350, 300);
        setBackground(background);
    }
}
