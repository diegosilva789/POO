package org.fatec;

import java.util.Scanner;

public class Controle {
	// scanner -- input (entrada de dados pelo teclado)
	public Scanner scanner;

	public Controle() {
		// System - significa seu computador
		// in - teclado
		this.scanner = new Scanner (System.in);
	}
	
	public int opcao() {
		int op = scanner.nextInt();
		return op;
	}
	
	public String texto() {
		String t = scanner.nextLine();
		return t;
	}
	
	// sobreescrever mais um metodo da classe Object
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}

}
