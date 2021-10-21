import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        scan.close();
        System.out.println("Hola " + nombre);
    }
}