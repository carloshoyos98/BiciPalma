package estacion;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EstacionTest {

    @Test
    public void consultarEstacionTest() {
        Estacion estacion = new Estacion(2, "Manacor", 10);

        // assert(System.out.println("id: 2\ndireccion: Manacor\nnumeroAnclajes: 10") == estacion.consultarEstacion());
    }

    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(2, "Manacor", 10);
        assertEquals(5, estacion.anclajesLibres());
    }
}
