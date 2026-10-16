package uniquindio.edu.co;

public class PedidoEmpaque extends PedidoDecorator {

    public PedidoEmpaque(Pedido pedidoBasico) {
        super(pedidoBasico);
    }

    @Override
    public String getDescripcion() {
        return pedidoBasico.getDescripcion() + ", con Empaque de Regalo Premium";
    }

    @Override
    public double getPrecio() {
        return pedidoBasico.getPrecio() + 15000;
    }
}