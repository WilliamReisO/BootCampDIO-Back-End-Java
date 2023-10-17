package set.operaçoesbasicas;

import java.util.Objects;

public class Convidado {
    // atributo 

    private String nome;

    private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		super();
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}

    
}
