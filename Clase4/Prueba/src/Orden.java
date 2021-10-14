public class Orden {
    private Integer idOrden;
    private String nombreCliente;
    private String categoria;
    private String nombreProducto;
    private Integer cantidad;

    public Orden(Integer idOrden, String nombreCliente, String categoria, String nombreProducto, Integer cantidad) {
        this.idOrden = idOrden;
        this.nombreCliente = nombreCliente;
        this.categoria = categoria;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }


    public Integer getIdOrden() {
        return this.idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}
