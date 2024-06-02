import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foguete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foguete extends Actor
{
    private  int cd=0;
    public Foguete(){
        setRotation(275);
    }
    
    public void act()
    {
        checkHitByTiroAbelha();
    
        if(Greenfoot.isKeyDown("up")){
           move(4); 
        }
        if(Greenfoot.isKeyDown("down")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("f")){
            fire();
        }
        if(cd >0){
            cd--;
        }



    }
    public void fire(){
        if(cd==0){
            tiro Tiro = new tiro();
                 int tiroX = getX(); 
        int tiroY = getY() - getImage().getHeight() / 2; 
            getWorld().addObject(Tiro, tiroX, tiroY);
            
            cd=20;
            
            
        }
        
    }
    public void checkHitByTiroAbelha(){
        tiroAbelha tiro =(tiroAbelha)getOneIntersectingObject(tiroAbelha.class);
        if(tiro !=null){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOverScreen());
        }
        
    }
}
