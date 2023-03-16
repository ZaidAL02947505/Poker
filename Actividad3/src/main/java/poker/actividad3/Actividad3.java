package poker.actividad3;
import java.util.*;
/**
 *
 * @author Zaid Kahev De La Garza Hernandez
 */
public class Actividad3 {
    public static void main (String[] args){
        
    Deck deck = new Deck();
    deck.Barajear();
    
    String Reiniciar;
    do{
        int opciones =6;
         boolean validacion = true;
         do{
             System.out.println("Menu");
             System.out.println("1.Suffle");
             System.out.println("2.Head");
             System.out.println("3.Pick");
             System.out.println("4.Hand");
             System.out.println("5.Exit");
             
             try{
                 System.out.println ("Opcion: ");
                 Scanner scanner = new Scanner (System.in);
                 opciones = scanner.nextInt();
             }
             catch (InputMismatchException e){
                    System.out.println("Caracteres incorrectos");
             }
             if (opciones >=6 || opciones <=0){
                 System.out.println("Porfavor selecciona una de las opciones proporcionadas");
                    validacion = true;
                  } 
             else {
                    validacion = false;
                  }
}
            while (validacion);
       
            switch (opciones) {
                case 1 -> deck.shuffle();
                case 2 -> deck.head();
                case 3 -> deck.pick();
                case 4 -> deck.hand();
                case 5 -> System.exit(0);
            }

            Scanner scanner = new Scanner(System.in);

            System.out.println("¿Deseas seleccionar otra opción? (s/n)");
            Reiniciar = scanner.nextLine();
            Reiniciar.toLowerCase();

        } while (Reiniciar.equals("s"));

    }
}
