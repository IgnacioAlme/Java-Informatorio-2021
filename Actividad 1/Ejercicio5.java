import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for (int index = 0; index < 10; index++) {
            System.out.println(num + " * " + (index + 1) + " = " + (num * (index + 1)));
        }
    }
}
