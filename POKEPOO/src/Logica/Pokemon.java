
package Logica;

/**
 *
 * @author tesla
 */
public abstract class Pokemon {
    
    
    //Atributos que pueden implementar clases hijas.
    protected int num_pokedex;
    protected String nombre;
    protected Double peso;
    protected String sexo;
    protected int temporada;
    
    //Metodos que pueden implementar clases hijas.
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
}
