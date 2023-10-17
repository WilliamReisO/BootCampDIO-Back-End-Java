package set.operaçoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados(){
		this.convidadoSet = new HashSet<>();
}
	public void adicionarConvidadoSet(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerconvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet){
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}	
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public static void main (String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados());
		
		conjuntoConvidados.adicionarConvidadoSet( "Convidado 1" ,12345);
		conjuntoConvidados.adicionarConvidadoSet( "Convidado 2" ,12265);
		conjuntoConvidados.adicionarConvidadoSet( "Convidado 3" ,12908);
		conjuntoConvidados.adicionarConvidadoSet( "Convidado 4" ,12315);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " convidados dentro do SetConvidados");

		conjuntoConvidados.removerconvidadoPorCodigoConvite(12345);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " convidados dentro do SetConvidados");

	}
}
	
