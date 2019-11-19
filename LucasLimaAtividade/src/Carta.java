public class Carta {
    private String face;
    private String naipe;
    private int valor;

    public Carta(String face, String naipe, int valor) {
        this.face = face;
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return face + " de " + naipe;
    }
}
