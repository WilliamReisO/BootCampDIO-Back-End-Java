package orientacao_a_objetos_e_uml.iPhone;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Usuario{

	
	public static void main(String [] args) {
		
		Iphone iphone = new Iphone();
		
		Scanner Ler = new Scanner(System.in);
		
		int opcao;
		while (true) {
		System.out.println("                                                          ");
		System.out.println("                 MENU IPHONE                         ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Telefone                             ");
		System.out.println("            2 - Navegador Internet                   ");
		System.out.println("            3 - Reproduzir musica                    ");
		System.out.println("            4 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
	
	

	try {
	    opcao = Ler.nextInt();
	} catch (InputMismatchException e) {
		System.out.println("\nDigite valores Inteiros!");
		Ler.nextLine();
		opcao = 0;
	}

	if (opcao == 4) {
		System.out.println( "IPHONE DO WILL!");
		Ler.close();
		System.exit(0);
	}
	
	switch (opcao) {
	
	case 1:
		
		int opTele;
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Ligar                                ");
		System.out.println("            2 - Atender                              ");
		System.out.println("            3 - Lista de Contato                     ");
		System.out.println("            4 - iniciarCorrerioVoz                   ");
		System.out.println("            5 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("            Entre com a opção desejada:              ");

		try {
			opTele = Ler.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores Inteiros!");
			Ler.nextLine();
			opTele = 0;
			}
		if (opTele == 5) {
			System.out.println("             Telefone Opões                          ");
			Ler.close();
			System.exit(0);
		}
		
		switch(opTele) {
		
		case 1:
			 Iphone.AparelhoTelefonico.ligar();
				keyPress();
			 break;
		case 2:
			 Iphone.AparelhoTelefonico.Atender();
			 keyPress();
			 break;
		case 3:
			 Iphone.AparelhoTelefonico.ListaTelefones();
				keyPress();

			 break;
		case 4:
			 Iphone.AparelhoTelefonico.iniciarCorrerioVoz();
				keyPress();

			 break;
			 
		default:
			System.out.println( "\nOpção Inválida!\n");

			keyPress();
			break;
		}
		
		break;
		
	case 2:
		int opNav;
		System.out.println("             Navegador Internet  Opões               ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - exibirPagina                         ");
		System.out.println("            2 - adicionarNovaAba                     ");
		System.out.println("            3 - atualizarPagina                      ");
		System.out.println("            4 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("            Entre com a opção desejada:              ");
		try {
		    opNav = Ler.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores Inteiros!");
			Ler.nextLine();
			opNav = 0;
			}
		if (opNav == 4) {
			System.out.println("             Telefone Opões                          ");
			Ler.close();
			System.exit(0);
		}
		
		switch(opNav) {
		
		case 1:
			Iphone.NavegadorInternet.exibirPagina();
			keyPress();
			break;
		case 2:
			Iphone.NavegadorInternet.adicionarNovaAba();
			keyPress();
			break;
		case 3:
			Iphone.NavegadorInternet.atualizarPagina();
			keyPress();
			break;
			
		default:
			System.out.println( "\nOpção Inválida!\n");

			keyPress();
			break;
		}
		keyPress();

		break;
	case 3:
		int opSom; 
		System.out.println("            Reproduzir musica Opões                  ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Tocar                                ");
		System.out.println("            2 - Pausar                               ");
		System.out.println("            3 - Reproduzir                           ");
		System.out.println("            4 - Lista de Musica                      ");
		System.out.println("            5 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("            Entre com a opção desejada:              ");
		
		try {
			opSom = Ler.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores Inteiros!");
			Ler.nextLine();
			opSom = 0;}
		if (opSom == 5) {
			System.out.println("             Reproduzir musica Opões                         ");
			Ler.close();
			System.exit(0);
		}
		
		switch(opSom) {
			
		case 1 :
			Iphone.ReprodutorMusicial.tocar();
			keyPress();
			break;
		case 2 : 
			Iphone.ReprodutorMusicial.pausar();
			keyPress();
			break;
		case 3 : 
			Iphone.ReprodutorMusicial.reproduzir();
			keyPress();
			break;
		case 4 : 
			Iphone.ReprodutorMusicial.ListaMusica();
			keyPress();
			break;
		}
		break;
		
	default:
		System.out.println( "\nOpção Inválida!\n");

		keyPress();
		break;
	}
	
}
		}
	private static void keyPress() {
		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}
	}
	
