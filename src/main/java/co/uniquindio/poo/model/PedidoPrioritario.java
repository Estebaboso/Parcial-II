package co.uniquindio.poo.model;

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
        return pedidoBasico.getPrecio() + 25000;
    }
}
