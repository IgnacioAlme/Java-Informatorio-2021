import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
        ArrayList<Integer> resultados = new ArrayList<Integer>();

        System.out.println("Lista de horas trabajadas:");
        cargarLista(horasTrabajadas, 5, scan);

        System.out.println("Lista de valor por hora:");
        cargarLista(valorPorHora, 5, scan);
        scan.close();

        System.out.println("Resultados:");
        System.out.println(resultadosArrayList(horasTrabajadas, valorPorHora));

        System.out.println("Total");
        System.out.println(calcularTotal(resultadosArrayList(horasTrabajadas, valorPorHora)));
        
    }

    private static void cargarLista(ArrayList<Integer> lista, int cantidad, Scanner scan) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el valor para el día " + (i + 1) + ":");
            lista.add(scan.nextInt());
        }
    }

    private static ArrayList<Integer> resultadosArrayList(ArrayList<Integer> horas, ArrayList<Integer> valor) {
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for (int i = 0; i < horas.size(); i++) {
            resultados.add(horas.get(i) * valor.get(i));
        }
        return resultados;
    }

    private static Integer calcularTotal(ArrayList<Integer> lista) {
        int total = 0;
        for (int i: lista) {
            total += i;
        }

        return total;
    }
}
