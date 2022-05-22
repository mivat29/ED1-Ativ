import java.util.Objects;

public class Subrotina {
	
	private String nome;
	private int numero;
	private String horaInicio;

	public Subrotina(String nome, int numero, String horaInicio) {
		this.nome = nome;
		this.numero = numero;
		this.horaInicio = horaInicio;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getHoraInicio(){
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio){
		this.horaInicio = horaInicio;
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero, horaInicio);
	}
	
	public boolean equals(Subrotina objeto) {
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (getClass() != objeto.getClass())
			return false;
		Subrotina other = (Subrotina) objeto;
		return Objects.equals(nome, other.nome) && numero == other.numero && horaInicio == other.horaInicio; 
	}
	
}
