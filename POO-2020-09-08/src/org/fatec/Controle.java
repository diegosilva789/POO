package org.fatec;

import java.util.Scanner;

public class Controle {
	// scanner -- input (entrada de dados pelo teclado)
	public Scanner leitor;

	public Controle() {
		// System - significa seu computador
		// in - teclado
		leitor = new Scanner (System.in);
	}
	
	public synchronized int opcao() {
		int op = leitor.nextInt();
		leitor = leitor.reset();
		return op;
	}
	
	public synchronized String texto() {
		leitor = new Scanner(System.in);
		String t = leitor.nextLine();
		leitor = leitor.reset();
		return t;
	}
	
	// sobreescrever mais um metodo da classe Object
	@Override
	protected void finalize() throws Throwable {
		leitor.close();
	}

}
