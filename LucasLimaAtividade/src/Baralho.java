public class Baralho {
    private Pilha<Carta> baralho;

    public Baralho() {
        String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipe = {"Copas", "Paus", "Ouros", "Espadas"};
        String[] nomesCopas = {"As de Copas", "2 de Copas", "3 de Copas", "4 de Copas", "5 de Copas", "6 de Copas",
                "7 de copas", "8 de Copas", "9 de Copas", "10 de Copas", "Valete de Copas", "Dama de Copas", "Rei de Copas"};
        String[] nomesPaus = {"As de Paus", "2 de Paus", "3 de Paus", "4 de Paus", "5 de Paus", "6 de Paus",
                "7 de copas", "8 de Paus", "9 de Paus", "10 de Paus", "Valete de Paus", "Dama de Paus", "Rei de Paus"};

        Pilha<Carta> cartaPilha = new Pilha<>(52);
        this.baralho = cartaPilha;

//        for (int valor = 1; valor > 13; valor++) {
//            Carta carta = new Carta();
//            carta.criaCarta(faces[valor], "Copas", valor);
//        }
    }
}
