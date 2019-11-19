/* Classe Pilha - armazena int */
public class Pilha<T> {
	private int topo;		/* índice do topo da pilha */
	private Object[] pilha;	/* vetor que representa a pilha */

	/* Construtor - recebe o tamanho da pilha (capacidade da pilha) */
	public Pilha(int tamanho) {
		topo = -1;				/* inicializa topo com -1 */
		pilha = new Object[tamanho];	/* cria o vetor da pilha */
	}

	/* Método isEmpty() - devolve true se a pilha está vazia
	 * e false caso contrário
	 */
	public boolean isEmpty() {
		return (topo == -1);

		/*
		 * instrução acima equivale a: if(topo == -1) { return true; } return false;
		 */
	}

	/* Método isFull() - devolve true se a pilha está cheia
	 * e false caso contrário
	 */
	public boolean isFull() {
		return (topo == pilha.length - 1);
		/*
		 * if (topo == (pilha.length - 1)) { return true; } return false;
		 */
	}

	
	/* Método push - Recebe a info a ser empilhada
	 * Se a pilha não estiver cheia, incrementa topo, e coloca
	 * info em pilha[topo]
	 */
	public void push(Object info) {
		if (!isFull()) {
			pilha[++topo] = info;
			/* a instrução acima equivale às 2 abaixo:
			topo++;
			pilha[topo] = info;
			*/
		}
		else {		/* pilha cheia */
			System.out.println("Pilha cheia");
		}
	}
	
	/* Método pop - se a pilha não estiver vazia, desempilha 
	 * e retorna o elemento do topo da pilha.
	 * Se a pilha estiver vazia, retorna -1
	 */
	public Object pop() {
		if (!isEmpty()) {
			return pilha[topo--];
			
			/* a instrução acima equivale às 3 abaixo:
			int retorno = pilha[topo];
			topo--;
			return retorno;
			*/
		}
		return -1;
	}
	
	/* Método peek - Retorna o elemento do topo da pilha */
	public Object peek() {
		if(!isEmpty()) {
			return pilha[topo];
		}
		return -1;
	}
	
	/* Método exibe - Exibe os elementos da pilha */
	public void exibe() {
		if(isEmpty()) {
			System.out.println("Pilha vazia");
		}
		else {
			for(int i = 0; i <= topo; i++) {
				System.out.println(pilha[i]);
			}
		}
		
	}
	

}
