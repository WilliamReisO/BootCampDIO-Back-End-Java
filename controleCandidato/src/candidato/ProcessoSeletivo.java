package candidato;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
 
		String []candidatos = {"felipe","marcia","pedro"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu=false;
		
		do {
			atendeu= atender();
			continuaTentando = !atendeu;
			if(continuaTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato Realizado com Sucesso");
			}
		}while(continuaTentando && tentativasRealizadas<3);
	}
	
	private static boolean atender() {
		// TODO Auto-generated method stub
		return false;
	}

	static void selecaoCandidatos() {
		
		String [] candidatos = {"felipe","marcia","pedro","jose","maiara"}; 
		
		int candidatosSelecionados=0;
		int candidatoAtual=0;
		double salarioBase=2000.0;
		
		while(candidatosSelecionados < 5) {
			String candidato = candidatos[candidatoAtual];	
			double salarioPretendido = valorPretendido();
			System.out.println("O CANDIDATO" + candidato +"Solicitou este valor");
			if(salarioBase >= salarioPretendido) {
				System.out.println("O CANDIDATO" + candidato +"foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}

	
	private static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar PARA O CANDIDATO");
		}else if(salarioBase==salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardando o Resultado Dos Demais Candidatos");
		}
	}
	static void imprimirSelecionados() {
		String []candidatos = {"felipe","marcia","pedro"};
		
		System.out.println("Imprindo Lista de Candidatos aprovados");
		
		for (int indice=0; indice < candidatos.length;indice++) {
			System.out.println("O candidato de n°" + (indice+1)+ "e o " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato: candidatos ) {
			System.out.println("O candidato selecionado doi " + candidato);
		}
	}
}
