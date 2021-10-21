import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int resultado = 1;
        scan.close();
        for (int i = 1; i <= num2; i++) {
            resultado = resultado * num1;
        }
        System.out.println(num1 + " elevado a " + num2 + " = " + resultado);
    }
}
