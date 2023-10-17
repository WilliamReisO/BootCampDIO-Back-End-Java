package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	private Set<Produto> produtoSet;
	
	public CadastroProduto(){
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade ) {
		produtoSet.add(new Produto(codigo, nome, preco,quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto> exibirProdutoProPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco);
			produtosPorPreco.addAll(produtoSet);
			return produtosPorPreco;
		}
	}

