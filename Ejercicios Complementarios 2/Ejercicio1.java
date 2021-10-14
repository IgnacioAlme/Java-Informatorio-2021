import java.util.ArrayList;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add("Resistencia");
        ciudades.add("Posadas");
        ciudades.add("Bariloche");

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i + 1) + " - " + ciudades.get(i));
        }
    }
}
