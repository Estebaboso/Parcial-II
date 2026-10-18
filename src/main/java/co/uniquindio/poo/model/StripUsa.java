package co.uniquindio.poo.model;

public class StripUsa {

    //esto solo simula la "pasarela" del pago

    public void chargeInDollars(double amountUSD, String customerEmail, String merchantKey){

        System.out.println("Procesando pago...\n" +"Cliente: " +customerEmail + "\nMonto en USD: " +amountUSD +"\nClave de Comercio: " +merchantKey);
    }
}
