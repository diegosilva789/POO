package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// tudo em java é herança de uma classe chamada Objeto
		// Object é fornecido por padrão pela maquina virutal
		
//		Object c  = new Cliente("Gerson", "17-99736-0772");
//		Cliente c  = new Cliente("Gerson", "17-99736-0772");
		
		// toda vez que se imprime a referencia de um objeto
		// implicitamente é chamado um método de nome toString()
		
//		System.out.println(c.getNome());
//		System.out.println(c.telefone);
		
//		System.out.println(c);
		
			
//		Cliente c = new Cliente("Diego", "12-12233-4667");
//		System.out.println(c);
//		c = null;
//		System.gc();
		
		Menu.imprimirMenu();
		Controle controle = new Controle();
		int escolha = controle.opcao();
		
		List<Cliente> registrados = new ArrayList<>();
		
		while(escolha != 0) {
			if(escolha == 1) {
				controle = new Controle();
				System.out.println("Por favor insira os dados do cliente:");
				String nome = controle.texto();
				String telefone = controle.texto();
				Cliente cliente = new Cliente(nome, telefone);
				registrados.add(cliente);
			} else if(escolha == 2) {
				for (Cliente cliente : registrados) {
					System.out.println(cliente.getNome());
				}
			} else {
				System.out.println("Então por favor escolha zero!!!");
			}
			
			Menu.imprimirMenu();
			controle = new Controle();
			escolha = controle.opcao();
			
			
			
		}

	}

}
