package co.uniquindio.poo.model;

public interface ProcesadorPago {

    //utiliza usuario para saber si esta bloqueado o no, y montoCOP cuanto dinero va a pagar en pesos, igual para identificar el tope
    void cobrarEnPesos(String Usuario, double MontoCOP);
}
