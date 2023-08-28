
package Logica;

/**
 *
 * @author tesla
 */
public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle efectua ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle efectua ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle efectua ataque Mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle efectua ataque Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle efectua ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle efectua ataque Pistola de Agua");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Squirtle efectua ataque Hidropulso");
    }
    
}
