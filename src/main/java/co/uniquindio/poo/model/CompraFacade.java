package co.uniquindio.poo.model;

public class CompraFacade {
    private final ProcesadorPago procesador;

    public CompraFacade() {
        String merchantKey = "Estebaboso123";
        this.procesador = new ProxyPago(merchantKey);
    }

    public void ejecutarCompraRapida(Producto producto, String usuario, boolean conGarantia, boolean conEmpaque, boolean conPrioritario) {
        System.out.println("\n[FACADE] Iniciando procesamiento de compra para el usuario: " + usuario);

        // Mostrar los productos
        producto.obtenerPrecio();
        producto.mostrar();

        //Armada del pedido
        Pedido pedido = new PedidoBase(producto);
        if (conGarantia) pedido = new PedidoGarantia(pedido);
        if (conEmpaque) pedido = new PedidoEmpaque(pedido);
        if (conPrioritario) pedido = new PedidoEmpaque(pedido);

        // Mostrar la descripción y el precio final del pedido
        pedido.getDescripcion();
        pedido.getPrecio();

        //Cobrar el pedido
        this.procesador.cobrarEnPesos(usuario, pedido.getPrecio());

        System.out.println("\n[FACADE] procesamiento de pago completado");
    }
}

