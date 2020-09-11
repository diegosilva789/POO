package org.fatec;

import java.util.ArrayList;
import java.util.List;

import org.etec.Produto;

// polimorfismo - varias formas / varios formas de executar

public class App {

	public static void main(String[] args) {
		// float - valores decimais - 64 bits
		// int - 32 bits
		
		float x = 10;
		int y  = (int) 10.3;
		
		Produto p1 = new Bebida("Cerveja", 10, 0.5, 5);
		Produto p2 = new Bebida("Vinho", 8, 1, 10);
		Produto p3 = new Laticinio("Queijo Minas", 20, 50, 10);
		
		// Produto p4 = new Produto("Coca-Cola", 8);		
		// List<String> listinha = new ArrayList<>();
			
		Produto[] lista = {p1, p2, p3};
		
		// p1.nome = "Fanta";
		
		//daqui para baixo (linha 20) o sistema como um todo
		
		// System.out.println(p1.getNome());
		// System.out.println(p2.getNome());
		// System.out.println(p3.getNome());
		
		// p1.resumo();
		// p2.resumo();
		// p3.resumo();
		
		for (Produto i : lista) {
			i.resumo();
		}
		
	}

}
