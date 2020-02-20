package bicicleta;

public class Bicicleta {
    private int id = 000;

    public Bicicleta(int id) {
        this.id = id;
    }

    private int setId() {
        return this.id += 1;
    }
}
