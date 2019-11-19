public class Carta {
    private String face;
    private String naipe;
    private int valor;

    public Carta(String face, String naipe, int valor) {
        this.face = face;
        this.naipe = naipe;
        this.valor = valor;
    }

//    public Carta criaCarta(String nome, String face, String naipe, int valor){
//        return new Carta()
//    }

    @Override
    public String toString() {
        return face + " de " + naipe;
    }
}
