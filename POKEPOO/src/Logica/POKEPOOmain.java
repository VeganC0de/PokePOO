
package Logica;

/**
 *
 * @author tesla
 */
public class POKEPOOmain {
    
   public static void main(String[] args){
       
       Squirtle squirtle = new Squirtle();
       Charmander charmander = new Charmander();
       Pikachu pikachu = new Pikachu();
       Bulbasaur bulbasaur = new Bulbasaur();
       
       squirtle.atacarAraniazo();
       squirtle.atacarHidroBomba();
       
       charmander.atacarAraniazo();
       charmander.atacarLanzaLlamas();
       
       pikachu.atacarAraniazo();
       pikachu.atacarImpactrueno();
       
       bulbasaur.atacarAraniazo();
       bulbasaur.atacarHojaAfilada();
       
   } 
    
}
