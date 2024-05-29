import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Espaco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Espaco extends MyWorld
{

    /**
     * Constructor for objects of class Espaco.
     * 
     */
    public Espaco()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Foguete foguete = new Foguete();
        addObject(foguete,381,748);
        abelha abelha = new abelha();
        addObject(abelha,662,101);
        abelha abelha2 = new abelha();
        addObject(abelha2,376,97);
        abelha abelha3 = new abelha();
        addObject(abelha3,121,101);
        abelha abelha4 = new abelha();
        addObject(abelha4,672,244);
        abelha abelha5 = new abelha();
        addObject(abelha5,388,237);
        abelha abelha6 = new abelha();
        addObject(abelha6,129,251);
        abelha abelha7 = new abelha();
        addObject(abelha7,540,161);
        abelha abelha8 = new abelha();
        addObject(abelha8,236,165);
    }
}
