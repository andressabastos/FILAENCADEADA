package Fila;

public class FilaEncadeada implements OperacoesFila {
	private No inicio_fila;
	private No final_fila;
	private int qtd;
	private int senha;
	
	public FilaEncadeada() {
	qtd = 0;
	inicio_fila = null;
	final_fila = null;
	senha = 0;
	
	
	}
	

	@Override
	public boolean filaVAZIA() {
		if (qtd == 0)
			return true;
		else 
		return false;
	}

	@Override
	public void inserir() {
		senha ++;
		No novo = new No(senha);
		if (filaVAZIA()) {
			inicio_fila = novo;
			final_fila = novo;
		
		}else {
			final_fila.setProx(novo);
			final_fila = novo;
		
		}
		qtd++;
	}

	@Override
	public void remover() {
		if (filaVAZIA())
			System.out.println("A fila está vazia");
		else if (inicio_fila == final_fila){
			inicio_fila = null;
			qtd++;
		}else {
			No aux = inicio_fila.getProx();
			aux = inicio_fila;
			qtd ++;
		}
	}

	@Override
	public void imprimir() {
		No aux = inicio_fila;
		if ( filaVAZIA())
			System.out.println("A fila está vazia");
		else {
			for (int i = 0 ; i < qtd; i++)
				System.out.println("Senha:" + aux.getValor());
			aux = aux.getProx();
		}
	}

	@Override
	public void tamanhoFila() {
		System.out.println("A fila tem"+ qtd + "senhas");
	}

}
