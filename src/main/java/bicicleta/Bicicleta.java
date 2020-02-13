package bicicleta;

public class Bicicleta {
    private int id = 000;

    public Bicicleta() {
        this.id = setId();
    }

    private int setId() {
        return this.id += 1;
    }
}
