package co.uniquindio.poo.model;

public class PedidoBase implements Pedido {

    private final Producto producto;

    public PedidoBase(Producto producto) {
        this.producto = producto;
    }
    @Override
    public String getDescripcion() {
        return "Pedido Simple";
    }

    @Override
    public double getPrecio() {
        return producto.obtenerPrecio();
    }
}
