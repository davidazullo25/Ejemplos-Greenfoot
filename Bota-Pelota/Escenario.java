import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Escenario extends World {
    public Escenario() {
        super(600, 400, 1, true); 
        prepare();
    }

    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            Pelota pelota = new Pelota();
            MouseInfo raton = Greenfoot.getMouseInfo();
            addObject(pelota, raton.getX(),raton.getY());
        }
    }

    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,168,327);
    }
}
