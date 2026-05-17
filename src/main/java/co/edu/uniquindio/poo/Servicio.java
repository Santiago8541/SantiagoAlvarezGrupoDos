package co.edu.uniquindio.poo;

public abstract class Servicio {

    private final String id;
    private final String descripcion;
    private final int duracionEstimada;

    public Servicio(String id, String descripcion, int duracionEstimada) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracionEstimada = duracionEstimada;
    }

    // Método abstracto
    public abstract double calcularCosto();

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}
