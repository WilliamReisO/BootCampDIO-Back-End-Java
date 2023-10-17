package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContatos(String nome, int numero) {
		contatoSet.add(new Contato(nome,numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);		}
		}
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c :contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}	
			
		}
		return contatoAtualizado;
	}
	
	public static void main (String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContatos("Camila",1234);
		agendaContatos.adicionarContatos("Carol",5665);
		agendaContatos.adicionarContatos("Camila Cavalcante",111111);
		agendaContatos.adicionarContatos("vitor",345689);
		agendaContatos.adicionarContatos("maria dos Reis",111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("maria"));

	}
	
	
}
