package co.edu.uniquindio.poo;

public class Carpinteria extends Servicio {

    private boolean estructural;
    private boolean herramientaPesada;

    public Carpinteria(String id, String descripcion,
                       int duracionEstimada,
                       boolean estructural,
                       boolean herramientaPesada) {

        super(id, descripcion, duracionEstimada);
        this.estructural = estructural;
        this.herramientaPesada = herramientaPesada;
    }
    public double calcularCosto() {

        double costo = 60000;

        if (herramientaPesada) {
            costo += 15000;
        }

        return costo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarpinteria{" +
                "estructural=" + estructural +
                ", herramientaPesada=" + herramientaPesada +
                '}';
    }
}
