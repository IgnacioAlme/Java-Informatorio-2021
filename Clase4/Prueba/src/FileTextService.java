import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileTextService implements FileService{
    
    @Override
    public List<Orden> cargarOrdenes(Path path) {
        List<Orden> ordenes = new ArrayList<>();
        List<String> contenido;
        try {
            contenido = Files.readAllLines(path);
            for(String lineaContenido: contenido) {
                String[] datosLinea = lineaContenido.split(",");
                Orden ordenActual = new Orden(Integer.valueOf(datosLinea[0]),
                    datosLinea[1],
                    datosLinea[2],
                    datosLinea[3],
                    Integer.valueOf(datosLinea[4]));
                ordenes.add(ordenActual);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ordenes;
    }

}
