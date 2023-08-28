
package Logica;

/**
 *
 * @author tesla
 */
public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander efectua ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander efectua ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander efectua ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander efectua ataque Puño de Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander efectua ataque Lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander efectua ataque Ascuas");
    }
    
}
