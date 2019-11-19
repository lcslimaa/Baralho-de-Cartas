public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.exibeCartas();
        baralho.embaralhar();
        System.out.println(baralho.virarCarta());
    }
}
