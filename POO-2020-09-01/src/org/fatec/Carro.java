package org.fatec;

// a classe planta baixa de um objeto, modelo ou molde
// objeto é o que o introduzido no sistema

public class Carro {
	// atributos, variaveis de classe // globais
	public String modelo;
	public String cor;
	public int quantidadeLugares;
	
	// quando não declarado, o construtor é fornecido pela maquina virtual
	
	// metodo construtor é um metodo especial, com o mesmo nome da classe
	// posso dar comportamentos diferentes
	public Carro(String modelo, String cor, int quantidadeLugares) {
		this.modelo = modelo;
		this.cor = cor;
		this.quantidadeLugares = quantidadeLugares;
	}
	
	// metodos duplicados, com a diferença na quantidade e tipo de parametros
	// isto representa sobrecarga de metodo
	public Carro(String modelo, int quantidadeLugares) {
		this.modelo = modelo;
		this.quantidadeLugares = quantidadeLugares;
	}

	// construtor em branco, também funciona, mas nao armazena nada
	public Carro() {
	}
	
	// metodo do tipo void não retorna valro!
	public void imprimirDados() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Quantidade de Lugares: " + quantidadeLugares);
		System.out.println("---------------------------------------");
	}
	
	// metodo que tem tipo retorna alguma coisa (valor)!
	// modificador(public) tipo nome(){}
	public String imprimirDados2() {
		return "Modelo: " + modelo + "\n" + "Cor: " + cor 
				+ "\n" + "Quantidade de Lugares: " + quantidadeLugares 
				+ "\n" + "---------------------------------------";
	}
}
