public class Carta {
    private String face;
    private String naipe;
    private int valor;

    public Carta(String face, String naipe, int valor) {
        this.face = face;
        this.naipe = naipe;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getNaipe(){
        return naipe;
    }

    @Override
    public String toString() {
        return face + " de " + naipe;
    }
}
