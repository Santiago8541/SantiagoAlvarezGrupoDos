package co.edu.uniquindio.poo;

import javax.swing.*;

public class MainServicio {

    public static void main(String[] args) {

        SistemaGestion sistema = new SistemaGestion();

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    
                    ===== MENÚ =====
                    
                    1. Registrar técnico
                    2. Crear orden electricidad
                    3. Consultar servicios vivienda
                    4. Actualizar estado
                    5. Calcular costo vivienda
                    0. Salir
                    """));

            switch (opcion) {

                case 1 -> {

                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String id = JOptionPane.showInputDialog("Identificación:");
                    String cert = JOptionPane.showInputDialog("Certificación:");
                    int exp = Integer.parseInt(
                            JOptionPane.showInputDialog("Experiencia:")
                    );

                    Tecnico tecnico = new Tecnico(nombre, id, cert, exp);

                    boolean registrado = sistema.registrarTecnico(tecnico);

                    if (registrado) {
                        JOptionPane.showMessageDialog(null,
                                "Técnico registrado");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Técnico duplicado");
                    }
                }

                case 2 -> {

                    String cert="";
                    Tecnico tecnico = new Tecnico(
                            "12345",
                            "Electricista",
                            cert, 5
                    );

                    Vivienda vivienda = new Vivienda(
                            "Calle 10",
                            TipoInmueble.CASA,
                            4
                    );

                    Electricidad servicio = new Electricidad(
                            "E1",
                            "Reparación eléctrica",
                            3,
                            true,
                            2
                    );

                    OrdenServicio orden = new OrdenServicio(
                            "O1",
                            tecnico,
                            vivienda,
                            servicio
                    );

                    sistema.agregarOrden(orden);

                    JOptionPane.showMessageDialog(null,
                            "Orden creada");
                }

                case 3 -> {

                    String direccion = JOptionPane.showInputDialog(
                            "Dirección:"
                    );

                    var lista =
                            sistema.obtenerServiciosPorVivienda(direccion);

                    String mensaje = "";

                    for (OrdenServicio o : lista) {

                        mensaje += o.getServicio().getDescripcion()
                                + " - "
                                + o.getEstado()
                                + "\n";
                    }

                    JOptionPane.showMessageDialog(null, mensaje);
                }

                case 4 -> {

                    String idOrden = JOptionPane.showInputDialog(
                            "ID Orden:"
                    );

                    sistema.actualizarEstadoServicio(
                            idOrden,
                            EstadoServicio.EN_PROGRESO
                    );

                    JOptionPane.showMessageDialog(null,
                            "Estado actualizado");
                }

                case 5 -> {

                    String direccion = JOptionPane.showInputDialog(
                            "Dirección:"
                    );

                    double total =
                            sistema.calcularCostoTotalVivienda(direccion);

                    JOptionPane.showMessageDialog(null,
                            "Costo total: $" + total);
                }
            }

        } while (opcion != 0);
    }
}
