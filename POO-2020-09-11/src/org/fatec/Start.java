package org.fatec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		// Array - Vetor (todo array é um objeto)
		// Tamanho Fixo, em memória
		// tipo[] variavel = new tipo[tamamho];
		// tipo[] variavel = {5, 8, 9, 10};
		// int[] x = new int[5];
//		int[] x = {5, 8, 9, 10};
//		System.out.println(x[0]);
//		System.out.println(x[2]);
//		System.out.println(x.length);
				
		// Pessoa[] gente = new Pessoa[5];
		// Pessoa p = new Pessoa("Gerson");
		// gente[0] = p;
		// gente[0] = new Pessoa("Gerson");
//		Pessoa[] gente = {new Pessoa("Gerson"), new Pessoa ("Alberto")};
//		System.out.println(gente[0].nome);
//		System.out.println(gente[1].nome);
				
		// para iterar
//		for (int posicao = 0; posicao < gente.length; posicao++) {
//			System.out.println(gente[posicao].nome);
//		}
				
		// foreach - each = cada
		// para cada
//		for (Pessoa pessoa : gente) {
//			System.out.println(pessoa.nome);
//		}
		
		// List
		// List<tipo> variavel = new TipoEspecificoDaLista<>();
		// TipoEspecificoDaLista -> ArrayList
		// List, pode aumentar ou diminuir o tamanho em memoria
//		List<Pessoa> gente = new ArrayList<>();
//		gente.add(new Pessoa ("Gerson"));
//		gente.add(new Pessoa ("Alberto"));
//		gente.remove(1);
//		
//		System.out.println(gente.size());
//		
//		for (Pessoa pessoa : gente) {
//			System.out.println(pessoa.nome);
//		}
		
		// Set - conjunto
		// x = {1,2,3} nao pode repetir {1,1,2,3}
		
//		Set<String> palavras = new HashSet<>();
//		palavras.add("Marea");
//		palavras.add("Opala");
//		palavras.add("Marea");
//		palavras.add("Opala");
//		
//		System.out.println(palavras.size());
//		
//		for (String palavrinha : palavras) {
//			System.out.println(palavrinha);
//		}
		
//		Set<Pessoa> pessoinhas = new HashSet<>();
//		pessoinhas.add(new Pessoa("Gerson"));
//		pessoinhas.add(new Pessoa("Gerson"));
//		
//		for (Pessoa p : pessoinhas) {
//			System.out.println(p.nome);
//		}
		
//		Set<Object> objetos = new HashSet<>();
//		objetos.add("Texto");
//		objetos.add(new Pessoa("Gerson"));
//		
//		Object o = new Pessoa ("João");

		// look up table
		// Map<key, value>
		// Map<tipo, tipo> variavel = new tipoMapa<>();
//		Map<String, Pessoa> mapinha = new HashMap<String, Pessoa>();
//		mapinha.put("rapaz", new Pessoa ("Gerson"));
//		mapinha.put("moça", new Pessoa ("Maria"));
//		mapinha.remove("moça");
//		
//		System.out.println(mapinha.get("rapaz").nome);
//		System.out.println(mapinha.get("moça").nome);

		
		
	}

}
