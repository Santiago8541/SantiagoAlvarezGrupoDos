package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class SistemaGestion {

    private ArrayList<Tecnico> tecnicos;
    private ArrayList<OrdenServicio> ordenes;

    public SistemaGestion() {
        tecnicos = new ArrayList<>();
        ordenes = new ArrayList<>();
    }

    // Registrar técnico
    public boolean registrarTecnico(Tecnico tecnico) {

        for (Tecnico t : tecnicos) {

            if (t.identificacion().equals(tecnico.identificacion())) {
                return false;
            }
        }

        tecnicos.add(tecnico);
        return true;
    }

    // Agregar orden
    public void agregarOrden(OrdenServicio orden) {
        ordenes.add(orden);
    }

    // Obtener servicios por vivienda
    public ArrayList<OrdenServicio> obtenerServiciosPorVivienda(String direccion) {

        ArrayList<OrdenServicio> resultado = new ArrayList<>();

        for (OrdenServicio orden : ordenes) {

            if (orden.getVivienda().direccion().equalsIgnoreCase(direccion)) {
                resultado.add(orden);
            }
        }

        return resultado;
    }

    // Actualizar estado
    public boolean actualizarEstadoServicio(String idOrden,
                                            EstadoServicio nuevoEstado) {

        for (OrdenServicio orden : ordenes) {

            if (orden.getIdOrden().equals(idOrden)) {

                orden.setEstado(nuevoEstado);
                return true;
            }
        }

        return false;
    }

    // Calcular costo total vivienda
    public double calcularCostoTotalVivienda(String direccion) {

        double total = 0;

        for (OrdenServicio orden : ordenes) {

            if (orden.getVivienda().direccion().equalsIgnoreCase(direccion)) {

                total += orden.calcularCostoServicio();
            }
        }

        return total;
    }
}
