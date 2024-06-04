import greenfoot.*;  

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        super(800, 800, 1); 
        
        
    }
    public void act(){
        checkWithCondition();
        checkFoguete();
    }
    private void checkWithCondition(){
        if(getObjects(abelha.class).isEmpty()){
            Greenfoot.setWorld(new VictoryScreen());
        }
        
    }
    private void checkFoguete(){
        if(getObjects(Foguete.class).isEmpty()){
           Greenfoot.setWorld(new GameOverScreen()); 
        }
    }
    
}
