package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto{

    private String Nombre;
    private List<Producto> listaDeProductos;

    public Combo(String Nombre){

        this.Nombre = Nombre;
        this.listaDeProductos = new ArrayList<>();
    }

    //Metodo para agregar productos al combo
    public void agragarProducto(Producto producto){
        listaDeProductos.add(producto);
    }

    //Metodo para quitar productos del combo
    public void quitarProducto(Producto producto){
        listaDeProductos.remove(producto);
    }

    @Override
    public double obtenerPrecio() {
        double valorTotal = 0;
        for(Producto p : listaDeProductos){
            valorTotal += p.obtenerPrecio();
        }
        return valorTotal;
    }

    @Override
    public void mostrar() {

        System.out.println("Combo: " + Nombre +"\nPrecio: " + obtenerPrecio());

        for(Producto p : listaDeProductos){
            p.mostrar();
        }
    }
}
