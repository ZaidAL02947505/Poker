package poker.actividad3;
import java.util.LinkedList;
import java.util.Random;
/**
 *
 * @author Zaid Kahev De La Garza Hernandez
 */
public class Deck {
    LinkedList<String> baraja = new LinkedList<>();

    public Deck(){
    }
    Card card = new Card();

    public void Barajear(){
        String [] palo = card.getPalo();
        String [] color = card.getColor();
        String [] valor = card.getValor();
        String carta = "";
        int iterar = 0;
        int coloresCarta = 0;
        
        for (String palo1 : palo) {
            for (String valor1 : valor) {
                iterar++;
                if (iterar >= 27) {
                    coloresCarta = 1;
                }
                carta = "{" + palo1 + "}" + "," + "{" + color[coloresCarta] + "}" + "," + "{" + valor1 + "}";
                baraja.add(carta);
            }
        }
    }
    public void shuffle (){
        System.out.println("Se mezclo el deck");
    }
    public void head(){

        try {
            System.out.println("Tu carta es");
            System.out.println(baraja.getFirst());
            baraja.removeFirst();
        } catch(Exception e){
            System.out.println("Juego Terminado");
            System.exit(0);
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
    }
    public void pick (){

        int aleatorio  = 0;
        Random random = new Random();
        aleatorio = (int) (random.nextDouble() * baraja.size());

        try {
            System.out.println("Su carta es");
            System.out.println(baraja.get(aleatorio));
            baraja.remove(aleatorio);
            }
        catch(Exception e){
            System.out.println("Juego Terminado");
            System.exit(0);
            }
        System.out.println("Quedan " + baraja.size() + " cartas");
        }
    public void hand (){

        String [] mazo = new String[5];
        int aleatorio  = 0;
        Random random = new Random();

        for (int i = 0; i< mazo.length; i++){
            aleatorio = (int) (random.nextDouble() * baraja.size());
            try {
                mazo[i] = baraja.get(aleatorio);
                baraja.remove(aleatorio);
                } 
            catch (Exception e){
                System.out.println("Juego Terminado");
                System.exit(0);
                }
        }
        for (String cartas: mazo){
            System.out.println(cartas);
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
     }
}