import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        cargarAlumnos(alumnos);

        System.out.println(alumnos);

        System.out.println(alumnos.subList(0, (alumnos.size() / 3)));
        System.out.println(alumnos.subList(((alumnos.size() / 3)), ((alumnos.size() / 3) * 2)));
        System.out.println(alumnos.subList((((alumnos.size() / 3) * 2)), alumnos.size()));
    }

    static void cargarAlumnos(ArrayList lista) {
        for (int i = 0; i < 12; i++) {
            lista.add("Alumno " + (i + 1));
        }
    }
}
