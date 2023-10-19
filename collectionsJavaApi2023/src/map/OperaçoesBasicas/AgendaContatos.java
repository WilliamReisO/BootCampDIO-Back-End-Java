package map.OperaçoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
	
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContatos(String nome ,Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContatos(String nome) {
		if(agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	public void exibirConataos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
public static void main(String[] args) { 
	AgendaContatos agendaContatos = new AgendaContatos(); 
}
}
