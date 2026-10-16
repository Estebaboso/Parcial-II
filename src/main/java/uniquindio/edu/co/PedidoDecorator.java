package uniquindio.edu.co;

public abstract class PedidoDecorator implements Pedido {

    protected Pedido pedidoBasico;

    public PedidoDecorator(Pedido pedidoBasico) {
        this.pedidoBasico = pedidoBasico;
    }

    @Override
    public String getDescripcion() {
        return pedidoBasico.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return pedidoBasico.getPrecio();
    }
}