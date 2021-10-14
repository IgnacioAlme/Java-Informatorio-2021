import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, fact = 1;
        int num = scan.nextInt();
        scan.close();

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);
    }
}
