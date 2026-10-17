package co.uniquindio.poo.model;

public class ProductoIndividual implements Producto {

    private String Nombre;
    private double Precio;

    public  ProductoIndividual(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    @Override
    public double obtenerPrecio() {
        return Precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + Nombre  +"\nPrecio: " +Precio);
    }
}
