import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuScreen extends MyWorld
{
    public MenuScreen()
    {    
         
        showText("Pressione ESPAÇO para começar o jogo", getWidth() / 2, getHeight() / 2);
        showText("Use as setas para mover o foguete e 'F' para atirar", getWidth() / 2, getHeight() / 2 + 20);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
