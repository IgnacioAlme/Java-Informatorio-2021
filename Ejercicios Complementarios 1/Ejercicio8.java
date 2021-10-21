import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre y apellido: ");
        String nomYApe = scan.nextLine();
        System.out.println("Dirección: ");
        String direccion = scan.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = scan.nextLine();
        System.out.println("Edad: ");
        int edad = scan.nextInt();
        scan.close();
        System.out.println(nomYApe + " - " + edad + " - " + direccion + " - " + ciudad);
    }
}
