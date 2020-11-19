package testes;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String args[]) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		//Adc nomes
		nomes.add("Josu�");
		nomes.add("Hector");
		nomes.add("Ana");
		nomes.add("Helena");
		
		
		//Removendo um item pelo indice:
		nomes.remove(1);
		//Removendo um elemento pelo nome:
		nomes.remove("Ana");
		
		
		//Exibindo com indice espec�ficos
		System.out.println(nomes.get(0));
		
		
		//Como apagar todos os itens: 
		nomes.clear();
		
		//Exibindo toda a ArrayList
		System.out.println(nomes.toString());
		
		//M�todo para descobrir se a ArraiList esta vazia:
		System.out.println(nomes.isEmpty());
		
		nomes.add("Alberto");
		
		//M�todo para descobrir se cont�m o item pesquisado:
		System.out.println(nomes.contains("Alberto"));
		
		nomes.add("Yasmin");
		//Descobrir o tamanho
		System.out.println(nomes.size());
		
		
		//M�todo para descobrir o indice de um item: (se ele n�o encontratr retorna -1)
		System.out.println(nomes.indexOf("Yasmin"));
		
		System.out.println(nomes.indexOf("Yasmim"));
		
		
		
	}
	
}
