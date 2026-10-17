package co.uniquindio.poo.model;


public class ProxyPago implements ProcesadorPago {
    private final double MONTO_TOPE = 5000000;
    private String merchantKey;
    private ProcesadorPago procesadorPagoReal;

    public ProxyPago(String merchantKey) {
        this.merchantKey = merchantKey;
    }


    @Override
    public void cobrarEnPesos(String Usuario, double MontoCOP) {
        System.out.println("[REPORTE AUDITORIA] Petición de cobro de:" + Usuario + "Por el monto de: " + "$" + MontoCOP);

    if (MontoCOP > MontoCOP) {
        System.out.println("Transacción Rechazada supera el monto de: " + "$" + MONTO_TOPE);
        return;
    }
    if ("BLOQUEADO".equalsIgnoreCase(Usuario)){
     System.out.println("Transaccion Rechazada, el usuario" + Usuario + "se encuentra bloqueado");
     return;
    }
    if (procesadorPagoReal == null) {
        System.out.println("[PROXY] creando nuevo procesador de pago");
        procesadorPagoReal = new StripAdapter( new StripUsa(), merchantKey);
    }

    procesadorPagoReal.cobrarEnPesos(Usuario, MontoCOP);

    System.out.println("[REPORTE AUDITORIA] Peticion de cobro aprobada para: " + Usuario + "Por el monto de: " + "$" +MontoCOP);


    }
}
