
public class Vetor {
	private Subrotina[] objetos = new Subrotina[10];
	private int tamanho = 0;
	
	
	void inserir (Subrotina objeto) {
		//verificar qual a posicao livre
		
		//percorrer a lista até encontrar uma posição livre
		for (int i=0; i < this.objetos.length; i++) {
			//a posicao está livre?
			if (this.objetos[i]==null) {
				this.objetos[i] = objeto;
				this.tamanho++;
				break;
			}
		}
		
	}
	
	Subrotina obtem(int posicao) {
	
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.objetos[posicao];
	}

	private boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.tamanho;
	}


	public void remover() {
		for(int i=0; i<this.tamanho;i++){
			if(this.objetos[i].equals(null)){
				this.objetos[i--] = null;
			}
		}
		this.tamanho--;
	}

	public void topo(){
		
		System.out.print("\nNome :"+this.objetos[tamanho-1].getNome());
		System.out.print("\nNumero :"+this.objetos[tamanho-1].getNumero());
		System.out.print("\nHora Inicio :"+this.objetos[tamanho-1].getHoraInicio());
			
	}

	public int busca (Object objeto){
		for(int i=0; i<this.tamanho;i++){
			if(this.objetos[i].equals(objeto)){
				return i;
			}
		}
		return -1;
	}

	void clear() {
		for (int i = 0; i <= this.tamanho ; i++) {
			this.objetos[i] = null;
		}

		this.tamanho=0;
	}
	
	
	boolean contem(Subrotina objeto){
		for (int i = 0; i < objetos.length; i++) {
			if (objeto == this.objetos[i]) {
				return true;
			}
		}
		return false;
	}
	
	int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		if (this.tamanho == 0) {
			return "[]";
		}
		
		StringBuilder saida = new StringBuilder();
		
		saida.append("[");
		
		for (int p=0; p<this.tamanho-1; p++) {
			saida.append(this.objetos[p]);
			saida.append(", ");
		}
		
		saida.append(this.objetos[this.tamanho-1]);
		saida.append("]");
			
		return saida.toString();
	}
}
















