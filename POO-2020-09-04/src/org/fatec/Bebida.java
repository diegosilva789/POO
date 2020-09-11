package org.fatec;

import org.etec.Produto;

// A classe Bebida herda os atribuitos de Produto

public class Bebida extends Produto {
	
	public double litro;
	public double teorAlcool;

	public Bebida(String nome, double preco, double litro, double teorAlcool) {
		super(nome, preco);
		this.litro = litro;
		this.teorAlcool = teorAlcool;
	}
	
	public void qualSeuValor() {
		System.out.println("Meu valor é: " + preco);
	}
	
	public void qualSeuNome() {
		System.out.println("Meu nome é: " + nome);
	}

	@Override
	public void resumo() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Litro: " + litro);
		System.out.println("Teor Alcoolico: " + teorAlcool);
		System.out.println("--------------------------------");
	}
	
}
