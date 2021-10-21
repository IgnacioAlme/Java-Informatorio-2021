import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el número con el que se comienza: ");
        int n = scan.nextInt();
        System.out.print("Ingrese el número con el que terminará: ");
        int n2 = scan.nextInt();
        scan.close();
        fizzBuzz(n, n2);
    }
    private static void fizzBuzz(int num1, int num2) 
    {
        for (int i = num1; i <= (num2 - 1); i++) 
        {
            if (((i % 2) == 0) && ((i % 3) == 0)) 
                System.out.println("fizzbuzz");
            else if ((i % 2) == 0) 
                System.out.println("fizz");
            else if ((i % 3) == 0)
                System.out.println("buzz");
            else
                System.out.println(i); 
        }
    }
}
