import greenfoot.*;

public class MyWorld extends World {

    public MyWorld() {    
        super(800, 800, 1); 
        prepare();
    }
    
    private void prepare() {
       
    }

    public void act() {
        checkGameOver();
    }

    private void checkGameOver() {
        if (getObjects(Foguete.class).isEmpty()) {
            showGameOverText();
        } else if (getObjects(abelha.class).isEmpty()) {
            showVictoryText();
        }
    }

    private void showGameOverText() {
        showText("Você Perdeu!", getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }

    private void showVictoryText() {
        showText("Você Venceu!", getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }
}

