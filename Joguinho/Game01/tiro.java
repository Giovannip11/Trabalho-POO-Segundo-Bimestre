import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tiro extends Actor
{    
    private boolean hit = false;
    public tiro(){
        getImage().scale(10, 20);
            
    }
    public void act()
    {
        if(!hit){
        
            move(-20);
            checkCollision();
            removeIfOutofBounds();
        }
    
        
    }
    public void checkCollision(){
        abelha Abelha = (abelha) getOneIntersectingObject(abelha.class);
        if(Abelha !=null && !Abelha.isHit()){
           Abelha.hit();
          hit = true;
          setImage(new GreenfootImage(1,1));
            
        }
    }
    public void removeIfOutofBounds(){
        if(getY() <=0 || getX()<=0 || getX() >= getWorld().getWidth()){
            getWorld().removeObject(this);
            
        }
    }
    
}

