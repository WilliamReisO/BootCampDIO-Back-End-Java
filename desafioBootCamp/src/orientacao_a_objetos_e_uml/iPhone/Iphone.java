package orientacao_a_objetos_e_uml.iPhone;

public class Iphone {

	
	  class AparelhoTelefonico {

		 static void ligar() {
			System.out.println("Chamada em Andamento");
		}
		
		static void ListaTelefones() {
			
			String[] ListaContatos = {"Maria", "Fernando", "Renato", "Marta"};
			for (String contato : ListaContatos) {
			    System.out.println(contato);
			}
			System.out.println("Lista de contato");
			System.out.println(ListaContatos);
		}
		
		static void Atender() {
			System.out.println("Atendendo Ligação");
		}
		
		static void  iniciarCorrerioVoz () {
			System.out.println("Reproduzindo Correio Voz");
		}
		}

	
	 class NavegadorInternet {

			 static void exibirPagina() {
				System.out.println("Carregando Pagina");
			}
			 static void  adicionarNovaAba() {
				System.out.println("Abrindo Nova Pagina");
			}
			 static void atualizarPagina() {
				System.out.println("Recarregando Pagina");
			}
		}
	 
	 class ReprodutorMusicial {

		 static void tocar(){
				
				System.out.println("Reproduzindo Musica");
				
			}
			
		 static void pausar() {
				System.out.println("Reproduçao Pausada");
			}
			
		 static void reproduzir() {
				System.out.println("Escolher musica ");
			}
			
		 static void ListaMusica() {
				
				String[] listaDeMusicas = {"Latino", "Funk", "Rock", "Metal"};

				for (String musica : listaDeMusicas) {
				    System.out.println(musica);
				}
				
			}
}
	 }

