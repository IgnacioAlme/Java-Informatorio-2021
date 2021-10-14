import java.nio.file.Path;
import java.util.List;

public interface FileService {
    
    List<Orden> cargarOrdenes(Path path);

    int obtenerCantidadDeOrdenes(Path path);
}
