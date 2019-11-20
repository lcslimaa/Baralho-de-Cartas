import java.util.Random;

public class Baralho {

    private Pilha<Carta> baralho;

    public Baralho() {
        String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"Copas", "Paus", "Ouros", "Espadas"};

        this.baralho = new Pilha<>(52);

        int cont = 0;
        while (!baralho.isFull()) {
            baralho.push(new Carta(faces[cont % 13],
                    naipes[cont / 13],
                    cont % 13 + 1));
            cont++;
        }

    }

    public void exibeCartas() {
        baralho.exibe();
    }

    public Carta removeCarta(int ind) {
        Pilha<Carta> aux = new Pilha<>(52);

        for (int i = 0; i < ind; i++) {
            aux.push(baralho.pop());
        }

        Carta alvo = (Carta) baralho.pop();

        while (!aux.isEmpty()) {
            baralho.push(aux.pop());
        }
        return alvo;
    }

    public void embaralhar() {
        Random nroAleatorio = new Random();

        for (int i = 0; i < 52; i++) {
            int indice = nroAleatorio.nextInt(52);

            if (indice != 0) {
                Carta cartaRemovida = removeCarta(indice);
                baralho.push(cartaRemovida);
            }
        }
    }

    public Carta virarCarta(){
        if(!baralho.isEmpty()){
           Carta cartaVirada = (Carta) baralho.pop();
           return cartaVirada;
        }
        return null;
    }

}
