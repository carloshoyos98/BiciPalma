package estacion;

import java.lang.reflect.Array;

public class Estacion {
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes;

    public Estacion (int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];
    }

    public void consultarEstacion() {
        String estacion = "id: " + Integer.toString(this.id) + '\n' +
                          "direccion: " + this.direccion + '\n' +
                          "numeroAnclajes: " + Integer.toString(this.numeroAnclajes);
        System.out.println(estacion);
    }

    public void anclajesLibres() {

    }
}
