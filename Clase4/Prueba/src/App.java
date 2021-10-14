import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        FileService fileService = new FileTextService();
        Path path = Paths.get("src/orders.txt");
        List<Orden> ordenes = fileService.cargarOrdenes(path);
        for (Orden orden: ordenes) {
            System.out.println(orden);
        }
        System.out.println(fileService.obtenerCantidadDeOrdenes(path));
    }
}
