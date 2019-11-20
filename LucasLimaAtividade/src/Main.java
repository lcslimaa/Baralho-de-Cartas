import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1- Crie um objeto da classe Baralho.
        Baralho baralho = new Baralho();

        Scanner scanner = new Scanner(System.in);
        int aux = 0;
        int palpite = 0;
        int somaDasCartas = 0;

        //2- Exiba as cartas que estão no objeto baralho.
        baralho.exibeCartas();

        //3- Embaralhe o baralho.
        baralho.embaralhar();

        //4- Exiba novamente as cartas do baralho, após ter embaralhado.
        baralho.exibeCartas();

        //5- Embaralhe o baralho novamente.
        baralho.embaralhar();

        //6- Solicite que o usuário digite a quantidade de cartas a serem viradas. Esse valor deverá ser
        // um número entre 2 e 9. Enquanto não for um número nesse intervalo, solicite novamente.
        System.out.println("Digite a quantidade de cartas a serem viradas!");
        aux = scanner.nextInt();

        while(aux < 2 || aux > 9){
            System.out.println("Digite a quantidade de cartas a serem viradas!");
            aux = scanner.nextInt();
        }

        //7- Solicite que o usuário adivinhe o valor da soma das cartas viradas que forem de naipe preto (paus ou espadas).
        // Esse valor deverá ser um número maior ou igual a zero. Enquanto não for, solicite novamente.

        //8- Vire a quantidade de cartas solicitada pelo usuário. Exiba as cartas viradas.
        // Some o valor das cartas viradas que tiverem o naipe preto (paus ou espadas).

        //9- Exiba se o usuário ganhou ou perdeu. (O usuário ganhará o jogo se ele adivinhar
        // a soma dos valores das cartas de naipe preto que serão viradas).

        Object[] vetor = new Object[aux];

        System.out.println("Adivinhe o valor da somas da cartas de naipe preto!");
        palpite = scanner.nextInt();

        while(palpite < (-1)){
            System.out.println("Adivinhe o valor da somas da cartas de naipe preto!");
            palpite = scanner.nextInt();
        }

        for(int i = 0; i < aux; i++){
            Carta cartaVirada = baralho.virarCarta();
            vetor[i] = cartaVirada;
            System.out.println(cartaVirada);

            if(cartaVirada.getNaipe().equals("Paus") || cartaVirada.getNaipe().equals("Espadas")){
                somaDasCartas += cartaVirada.getValor();
            }
        }
        System.out.println("Seu palpite foi: " + palpite + "\n" + "A soma das cartas e: " + somaDasCartas);

        if(palpite == somaDasCartas){
            System.out.println("Parabéns você ganhou!");
        }else {
            System.out.println("Voce perdeu, tente novamente!");
        }


    }
}
