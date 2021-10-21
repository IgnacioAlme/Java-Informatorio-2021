import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(lista);
        System.out.println(lista.size());
        lista.add(0, 6);
        lista.add(7);
        System.out.println(lista);
        System.out.println(lista.size());
        
    }
}
