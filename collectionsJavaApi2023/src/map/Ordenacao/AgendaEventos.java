package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventoMap;
	
	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
		}
	
	public void adicionarEvento(LocalDate data, String nome , String atracao) {
		Evento evento = new Evento (nome,atracao);
				eventoMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventoTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximoDate = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
		for(Map.Entry<LocalDate, Evento> entry: eventoMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximoDate = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximoDate);
				
			}
		}
	}
	
	public static void main (String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
				System.out.println(LocalDate.now());
				//imprime a data atual do dia .
				
			
	}
}
