package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<OrdenServicio> listaOrdenes;

    public Empresa() {
        this.nombre = nombre;
        this.listaOrdenes = new ArrayList<>();
    }

    public void agregarOrden(OrdenServicio orden) {
        listaOrdenes.add(orden);
    }

    public void mostrarOrdenes() {

        for (OrdenServicio orden : listaOrdenes) {
            System.out.println(orden);
        }
    }
}
