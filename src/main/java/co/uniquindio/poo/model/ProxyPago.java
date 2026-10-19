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
        System.out.println("\n[REPORTE AUDITORIA] Petición de cobro de: " + Usuario + " Por el monto de: " + "$" + MontoCOP);

    if (MontoCOP > MONTO_TOPE) {
        System.out.println("\nTransacción Rechazada supera el monto de: " + "$" + MONTO_TOPE);
        return;
    }
    if ("BLOQUEADO".equalsIgnoreCase(Usuario)){
     System.out.println("\nTransaccion Rechazada, el usuario se encuentra: " + Usuario);
     return;
    }
    // Revisa si no existe un procesador de pago todavia y lo crea en StripAdapter porque ahi anda el  cobro real de la plata
    if (procesadorPagoReal == null) {
        System.out.println("\n[PROXY] creando nuevo procesador de pago");
        procesadorPagoReal = new StripAdapter( new StripUsa(), merchantKey);
    }

    procesadorPagoReal.cobrarEnPesos(Usuario, MontoCOP);

    System.out.println("\n[REPORTE AUDITORIA] Peticion de cobro aprobada para: " + Usuario + " Por el monto de: " + "$" + MontoCOP);


    }
}
