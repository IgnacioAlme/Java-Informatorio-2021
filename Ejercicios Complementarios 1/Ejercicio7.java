import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        scan.close();
        String resultado = "";

        for (int i = 0; i < string.length(); i++) {
            resultado = resultado + mayus(string.charAt(i));
        }

        System.out.println(resultado);
    }
    private static char mayus(char c) {
        return (char) (c - 32);
    }
}
