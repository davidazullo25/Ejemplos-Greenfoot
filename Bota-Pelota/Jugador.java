import greenfoot.*;  
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jugador extends Actor {
    boolean disparado=false;
    public void act() {
        int avance = 10;
        if(Greenfoot.isKeyDown("right"))
            this.setLocation(this.getX()+avance,this.getY());
        if(Greenfoot.isKeyDown("left"))
            this.setLocation(this.getX()-avance,this.getY());
        if(Greenfoot.isKeyDown("up"))
            this.setLocation(this.getX(),this.getY()-avance);
        if(Greenfoot.isKeyDown("down"))
            this.setLocation(this.getX(),this.getY()+avance);
        if(Greenfoot.isKeyDown("space")&&!disparado) {
            disparado=true;
            World mundo = this.getWorld();
            Disparo disparo = new Disparo();
            mundo.addObject(disparo, this.getX(),this.getY()-30);
        }
        if(isTouching(Pelota.class))
            this.removeTouching(Pelota.class);
    }    
}
