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
    private int speed = Greenfoot.getRandomNumber(2) == 0 ? 1 : -1; // Velocidade de movimento da abelha
    private int fireRate = 100; // Frequência de disparo da abelha
    private int fireDelay = 0; // Contador para controlar o intervalo de disparo
    
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
            speed = -1; // Inverte a direção quando atinge a borda inferior
        } else if (getY() <= 0) {
            speed = 1; // Inverte a direção quando atinge a borda superior
        }
    }
    
    public void checkFire() {
        if (fireDelay <= 0 && getWorld() != null) {
            if (getImage().getTransparency() > 0) { // Verifica se a abelha não está transparente
                tiroAbelha tiro = new tiroAbelha(this); // Passando a referência da abelha ao tiro
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
    }
    
    public boolean isHit() {
        return isHit;
    }
}
