import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tiroAbelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tiroAbelha extends Actor
{
    private int speed = 2; 
    private abelha owner;
    
    public tiroAbelha(abelha owner) {
        this.owner = owner;
        getImage().scale(12, 8);  
    }
   
    
    public void act() {
        moveAbelha();
        checkEdge();
    }
    
    public void moveAbelha() {
        setLocation(getX() + speed, getY());
    }
    
    public void checkEdge() {
        if (getX() >= getWorld().getWidth()) {
            getWorld().removeObject(this); 
        }
    }
    public void checkActive(){
         if(owner != null && !owner.isActive()){
            getWorld().removeObject(this);
        }
    }
    }


