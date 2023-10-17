package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable <Produto>{
    
private long codigo;

private String nome;

private double preco;

private int quantidade;

public Produto(long codigo, String nome, double preco, int quantidade) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
}


public int compareTo(Produto p) {
	return nome.compareToIgnoreCase(p.getNome());
}
public void setCodigo(long codigo) {
	this.codigo = codigo;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}


public void setPreco(double preco) {
	this.preco = preco;
}

public double getPreco() {
	return preco;
}


public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

@Override
public String toString() {
	return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
}


class ComparatorPorPreco implements Comparator<Produto>{
	
	public int compare(Produto p1,Produto p2) {
		return Double.compare(p1.getPreco(),p2.getPreco());
	}
}

@Override
public int hashCode() {
	return Objects.hash(codigo);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	return codigo == other.codigo;
}




}
