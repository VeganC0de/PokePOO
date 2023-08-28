
package Logica;

/**
 *
 * @author tesla
 */
public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu efectua ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu efectua ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu efectua ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu efectua ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu efectua ataque Puño de Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu efectua ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu efectua ataque Rayo Carga");
    }
    
}
