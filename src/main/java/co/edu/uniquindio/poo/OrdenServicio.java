package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class OrdenServicio {

    private String idOrden;
    private Tecnico tecnico;
    private Vivienda vivienda;
    private Servicio servicio;
    private ArrayList<TipoMaterial> materiales;
    private EstadoServicio estado;

    public OrdenServicio(String idOrden,
                         Tecnico tecnico,
                         Vivienda vivienda,
                         Servicio servicio) {

        this.idOrden = idOrden;
        this.tecnico = tecnico;
        this.vivienda = vivienda;
        this.servicio = servicio;
        this.materiales = new ArrayList<>();
        this.estado = EstadoServicio.PENDIENTE;
    }

    public void agregarMaterial(TipoMaterial material) {
        materiales.add(material);
    }

    public double calcularCostoServicio() {
        return servicio.calcularCosto();
    }

    public String getIdOrden() {
        return idOrden;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }
}
