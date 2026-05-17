package co.edu.uniquindio.poo;

public class Fontaneria extends Servicio {

    private boolean corteAgua;
    private String tipoMaterial;

    public Fontaneria(String id, String descripcion,
                      int duracionEstimada,
                      boolean corteAgua,
                      String tipoMaterial) {

        super(id, descripcion, duracionEstimada);
        this.corteAgua = corteAgua;
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public double calcularCosto() {

        double costo = 40000;

        if (corteAgua) {
            costo += 10000;
        }

        return costo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFontaneria{" +
                "corteAgua=" + corteAgua +
                ", tipoMaterial='" + tipoMaterial + '\'' +
                '}';
    }
}
