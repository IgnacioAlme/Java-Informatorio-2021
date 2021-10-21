import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String resultado = "";
        scan.close();
        for (int i = 0; i < num; i++) {
            System.out.println(resultado + (i + 1));
            resultado = resultado + String.valueOf(i + 1);
        }
    }
}
