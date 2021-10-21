import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int fact = factorial(num);
        System.out.println("El factorial de " + num + " es: " + fact);
    }
    static Integer factorial(Integer num) {
        if (num == 0)
            return 1;
        else
            return (num * factorial(num - 1));
    }
}
