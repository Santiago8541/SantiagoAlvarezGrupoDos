package co.edu.uniquindio.poo;

public class Electricidad extends Servicio {

    private boolean trabajoAlturas;
    private int cantidadCircuitos;

    public Electricidad(String id, String descripcion,
                        int duracionEstimada,
                        boolean trabajoAlturas,
                        int cantidadCircuitos) {

        super(id, descripcion, duracionEstimada);
        this.trabajoAlturas = trabajoAlturas;
        this.cantidadCircuitos = cantidadCircuitos;
    }

    @Override
    public double calcularCosto() {

        double costo = 50000;

        if (trabajoAlturas) {
            costo += 20000;
        }

        return costo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nElectricidad{" +
                "trabajoAlturas=" + trabajoAlturas +
                ", cantidadCircuitos=" + cantidadCircuitos +
                '}';
    }
}
