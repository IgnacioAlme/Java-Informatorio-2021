import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> baraja = new ArrayList<String>();
        llenarBaraja(baraja);

        System.out.println("En orden");
        System.out.println(baraja);

        System.out.println("Reverso");
        Collections.reverse(baraja);
        System.out.println(baraja);

        System.out.println("Desordenado");
        Collections.shuffle(baraja);
        System.out.println(baraja);
    }

    static void llenarBaraja(ArrayList baraja) {
        baraja.add("A");
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");
    }
}
