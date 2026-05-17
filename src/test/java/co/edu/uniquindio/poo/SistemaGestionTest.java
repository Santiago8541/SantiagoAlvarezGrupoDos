package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaGestionTest {

    @Test
    public void registrarTecnicoTest() {

        SistemaGestion sistema = new SistemaGestion();

        Tecnico tecnico = new Tecnico(
                "Juan",
                "123",
                "Electricista",
                5
        );

        assertTrue(sistema.registrarTecnico(tecnico));
    }

    @Test
    public void noRegistrarTecnicoDuplicadoTest() {

        SistemaGestion sistema = new SistemaGestion();

        Tecnico t1 = new Tecnico(
                "Juan",
                "123",
                "Electricista",
                5
        );

        Tecnico t2 = new Tecnico(
                "Pedro",
                "123",
                "Fontanero",
                3
        );

        sistema.registrarTecnico(t1);

        assertFalse(sistema.registrarTecnico(t2));
    }

    @Test
    public void calcularCostoElectricidadTest() {

        Electricidad servicio = new Electricidad(
                "E1",
                "Revisión",
                2,
                true,
                3
        );

        assertEquals(70000, servicio.calcularCosto());
    }

    @Test
    public void actualizarEstadoTest() {

        SistemaGestion sistema = new SistemaGestion();

        Tecnico tecnico = new Tecnico(
                "Juan",
                "123",
                "Electricista",
                5
        );

        Vivienda vivienda = new Vivienda(
                "Calle 1",
                TipoInmueble.CASA,
                4
        );

        Electricidad servicio = new Electricidad(
                "E1",
                "Revisión",
                2,
                true,
                3
        );

        OrdenServicio orden = new OrdenServicio(
                "O1",
                tecnico,
                vivienda,
                servicio
        );

        sistema.agregarOrden(orden);

        boolean actualizado = sistema.actualizarEstadoServicio(
                "O1",
                EstadoServicio.COMPLETADO
        );

        assertTrue(actualizado);
    }

    @Test
    public void calcularCostoTotalViviendaTest() {

        SistemaGestion sistema = new SistemaGestion();

        Tecnico tecnico = new Tecnico(
                "Juan",
                "123",
                "Electricista",
                5
        );

        Vivienda vivienda = new Vivienda(
                "Calle 1",
                TipoInmueble.CASA,
                4
        );

        Electricidad servicio = new Electricidad(
                "E1",
                "Revisión",
                2,
                true,
                3
        );

        OrdenServicio orden = new OrdenServicio(
                "O1",
                tecnico,
                vivienda,
                servicio
        );

        sistema.agregarOrden(orden);

        double total =
                sistema.calcularCostoTotalVivienda("Calle 1");

        assertEquals(70000, total);
    }
}
