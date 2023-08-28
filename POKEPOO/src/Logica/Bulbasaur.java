
package Logica;

/**
 *
 * @author tesla
 */
public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur efectua ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur efectua ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur efectua ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur efectua ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur efectua ataque Paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur efectua ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur efectua ataque Latigo Cepa");
    }
    
    
    
}
