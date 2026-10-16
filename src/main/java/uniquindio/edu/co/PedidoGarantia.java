package uniquindio.edu.co;

public class PedidoGarantia extends PedidoDecorator {

    public PedidoGarantia(Pedido pedidoBasico) {
        super(pedidoBasico);
    }

    @Override
    public String getDescripcion() {
        return pedidoBasico.getDescripcion() + ", con Póliza de Garantía";
    }

    @Override
    public double getPrecio() {
        return pedidoBasico.getPrecio() + (pedidoBasico.getPrecio() * 0.10);
    }
}