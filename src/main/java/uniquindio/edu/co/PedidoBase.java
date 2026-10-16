package uniquindio.edu.co;

public class PedidoBase implements Pedido {

    @Override
    public String getDescripcion() {
        return "Pedido Simple";
    }

    @Override
    public double getPrecio() {
        return 5000;
    }
}
