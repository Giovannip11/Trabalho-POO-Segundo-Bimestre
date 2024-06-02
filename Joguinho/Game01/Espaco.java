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
        abelha abelha9 = new abelha();
        addObject(abelha9,532,80);
        abelha9.setLocation(469,94);
        abelha abelha10 = new abelha();
        addObject(abelha10,294,89);
        abelha abelha11 = new abelha();
        addObject(abelha11,191,88);
        abelha3.setLocation(69,101);
        abelha11.setLocation(157,96);
        abelha6.setLocation(105,226);
        abelha abelha12 = new abelha();
        addObject(abelha12,597,97);
        abelha7.setLocation(495,222);
        abelha2.setLocation(356,110);
        abelha5.setLocation(407,182);
        abelha7.setLocation(489,199);
        abelha abelha13 = new abelha();
        addObject(abelha13,302,216);
        abelha10.setLocation(238,84);
        abelha8.setLocation(203,181);
        abelha7.setLocation(572,180);
        abelha5.setLocation(526,166);
        abelha9.setLocation(438,95);
        abelha5.setLocation(496,160);
        abelha13.setLocation(298,173);
        foguete.setLocation(757,335);
        abelha4.setLocation(193,600);
        abelha6.setLocation(122,400);
        abelha8.setLocation(27,289);
        abelha6.setLocation(15,399);
        abelha3.setLocation(33,152);
        abelha6.setLocation(44,405);
        abelha11.setLocation(60,63);
        abelha10.setLocation(16,516);
        abelha13.setLocation(30,663);
        abelha4.setLocation(94,594);
        abelha10.setLocation(35,506);
        abelha8.setLocation(46,242);
        abelha11.setLocation(51,50);
        abelha3.setLocation(47,133);
        abelha8.setLocation(37,253);
        abelha2.setLocation(122,314);
        abelha9.setLocation(151,87);
        abelha5.setLocation(245,215);
        abelha7.setLocation(217,476);
        abelha12.setLocation(191,723);
        abelha.setLocation(42,771);
        abelha10.setLocation(41,504);
        removeObject(abelha10);
        abelha7.setLocation(124,506);
        removeObject(abelha4);
        removeObject(abelha13);
        abelha12.setLocation(81,607);
        abelha.setLocation(108,762);
        removeObject(abelha5);
        removeObject(abelha3);
        abelha9.setLocation(84,152);
        abelha2.setLocation(140,210);
        abelha8.setLocation(53,307);
        abelha9.setLocation(131,117);
        abelha12.setLocation(43,594);
        abelha.setLocation(30,747);
        abelha7.setLocation(131,666);
        abelha.setLocation(37,752);
        abelha6.setLocation(44,433);
        abelha2.setLocation(132,519);
        abelha9.setLocation(162,179);
        abelha8.setLocation(54,295);
        removeObject(abelha6);
        abelha2.setLocation(129,402);
        abelha12.setLocation(46,561);
    }

    public void atores(){
        tiro Tiro = new tiro();
        addObject(Tiro, 100, 100);
    }
}
