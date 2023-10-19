package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {
		
	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

	// Desafio 1 
	   System.out.println("Mostre a lista na ordem númerica: ");
       List<Integer> numerosOrdemNatural = numeros.stream()
               .sorted(Comparator.naturalOrder())
               .collect(Collectors.toList());
       System.out.println(numerosOrdemNatural);
	
	//Desafio 2
	  int somaNumerosPares = numeros.stream()
              .filter(i -> (i % 2 == 0))
              .mapToInt(Integer::intValue)
              .sum();
      System.out.println("Pegue apenas os números pares e some: " + somaNumerosPares);
      
     //Desafio 3
      
      System.out.print("Verifique se todos os números da lista são positivos: ");
}
	}