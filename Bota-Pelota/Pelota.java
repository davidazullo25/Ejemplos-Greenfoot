import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pelota extends Actor {
    private int inc;
    private int iX;
    private int iY;
    
    public Pelota() {
        int azar = (int)(Math.random()*2);
        inc = 10;
        iX = (azar==1?1:-1)*inc;
        azar = (int)(Math.random()*2);
        iY = (azar==1?1:-1)*inc;
    }
    
    public void act() {
        int posX = this.getX();
        int posY = this.getY();
        World world = getWorld();
        if(posX+iX>=world.getWidth())
            iX*=-1;
        if(posY+iY>=world.getHeight())
            iY*=-1;
        if(posX+iX<0) 
            iX*=-1;
        if(posY+iY<0)
            iY*=-1;
        int X = posX+iX;
        int Y = posY+iY;
        this.setLocation(X, Y);
        if(isTouching(Pelota.class))
            this.removeTouching(Pelota.class);
    }    
}
