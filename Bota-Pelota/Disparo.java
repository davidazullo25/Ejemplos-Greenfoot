import greenfoot.*; 

public class Disparo extends Actor {
    public void act() {
        int avance=7;
        int azar = (int)(Math.random()*20);
        this.setLocation(this.getX()-(azar%2==0?-1:1)*azar,this.getY()-avance);
        this.turn(10);
        if(isAtEdge()) {
            World mundo = this.getWorld();
            mundo.removeObject(this);
        }
    }    
    
}
