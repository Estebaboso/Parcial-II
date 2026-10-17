package co.uniquindio.poo.model;

public class StripAdapter implements ProcesadorPago{

    private StripUsa strip;
    private String merchantKey;

    public StripAdapter(StripUsa stripe, String merchantKey){
        this.strip = stripe;
        this.merchantKey = merchantKey;
    }

    @Override
    public void cobrarEnPesos(String Usuario, double MontoCOP) {
        //se convirten los dolal a peso
        double montoUSD = MontoCOP /4000;

        //se adapta llamadno al metodo
        strip.chargeInDollars(montoUSD, Usuario, merchantKey);
    }
}
