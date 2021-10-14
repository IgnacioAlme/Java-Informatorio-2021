import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena = scan.nextLine();
        char letra = scan.next().charAt(0);
        int contador = 0;
        scan.close();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        
        System.out.println(contador);
    }
}
