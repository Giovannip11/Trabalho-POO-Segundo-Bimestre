import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class abelha extends Actor
    {

  private boolean isHit = false;
    private int speed = Greenfoot.getRandomNumber(2) == 0 ? 1 : -1; 
    private int fireRate = 100; 
    private int fireDelay = 0; 
    
    public abelha(){
        getImage().scale(40, 40);
    }
    
    public boolean isActive() {
        return getWorld() != null;
    }
    
    public void act() {
        moveVertical();
        checkEdge();
        checkFire();
    }
    
    public void moveVertical() {
        setLocation(getX(), getY() + speed);
    }
    
    public void checkEdge() {
        if (getY() >= getWorld().getHeight() - 1) {
            speed = -1; 
        } else if (getY() <= 0) {
            speed = 1;
        }
    }
    
    public void checkFire() {
        if (fireDelay <= 0 && getWorld() != null) {
            if (getImage().getTransparency() > 0) { 
                tiroAbelha tiro = new tiroAbelha(this); 
                getWorld().addObject(tiro, getX(), getY());
                fireDelay = fireRate;
            }
        } else {
            fireDelay--;
        }
    }
    
    public void hit() {
        isHit = true;
        getImage().setTransparency(0);
        removeTouching(abelha.class);
        
    }
    
    public boolean isHit() {
        return isHit;
    }
}
