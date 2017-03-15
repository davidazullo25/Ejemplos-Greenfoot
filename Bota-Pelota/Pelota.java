import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pelota extends Actor {
    private int inc;
    private int iX;
    private int iY;
    
    public Pelota() {
        inc = 10;
        iX = inc;
        iY = inc;
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
    }    
}
