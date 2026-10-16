package uniquindio.edu.co;

public class PedidoPrioritario extends PedidoDecorator {

    public PedidoPrioritario(Pedido pedidoBasico) {
        super(pedidoBasico);
    }
    @Override
    public String getDescripcion() {
        return pedidoBasico.getDescripcion() + ", con Manejo Prioritarío Frágil";
    }

    @Override
    public double getPrecio() {
        return pedidoBasico.getCosto() + 25000;
    }
}
