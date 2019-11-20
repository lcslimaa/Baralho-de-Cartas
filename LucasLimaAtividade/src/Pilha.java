public class Pilha<T> {
    private int topo;
    private Object[] pilha;

    public Pilha(int tamanho) {
        topo = -1;
        pilha = new Object[tamanho];
    }

    public boolean isEmpty() {
        return (topo == -1);

    }

    public boolean isFull() {
        return (topo == pilha.length - 1);
    }

    public void push(Object info) {
        if (!isFull()) {
            pilha[++topo] = info;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            return pilha[topo--];
        }
        return -1;
    }

    public Object peek() {
        if (!isEmpty()) {
            return pilha[topo];
        }
        return -1;
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i]);
            }
        }
        System.out.println("\n");

    }


}
